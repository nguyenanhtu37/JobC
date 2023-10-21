/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Enterprise;
import model.EnterpriseDB;
import model.Job;
import model.JobDB;
import model.User;

/**
 *
 * @author ASUS
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Job> jobss = JobDB.getlistJobAccept();
        request.setAttribute("jobss", jobss);
        ArrayList<Job> jobs = JobDB.getListJobdonaccept();
        request.setAttribute("jobs", jobs);
        ArrayList<Enterprise> enters = EnterpriseDB.getListEnter();
        request.setAttribute("Enters", enters);
        String uName = request.getParameter("username-login").trim();
        String pass = request.getParameter("pass-login").trim();
        String role = request.getParameter("role-login").trim();
        //remember me ?
//        String remember = request.getParameter("remember");
//        if(remember.equals("on")){
//            response.addCookie(new Cookie("account",uName));
//            response.addCookie(new Cookie("password",pass));
//            response.addCookie(new Cookie("role", role));
//        }
        // end remember
        request.setAttribute("role", role);
        
        if(role.equals("User")){
            if(!uName.equals("tunade170244@fpt.edu.vn") && !pass.equals("admin")){
                try {
                    User u = new User().login(uName,pass);
                    if(u != null){
                        request.getSession().setAttribute("User", u);
                        request.getRequestDispatcher("mainUser.jsp").forward(request, response);
                        return;
                    }
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else if(uName.equals("tunade170244@fpt.edu.vn") && pass.equals("admin")){
                request.getSession().setAttribute("tunade170244@fpt.edu.vn", "admin");
                request.getRequestDispatcher("mainAdmin.jsp").forward(request, response);
            }
            
        } else if( role.equals("Enterprise")){
            Enterprise e = new Enterprise().login(uName, pass);
            if( e != null){
                request.getSession().setAttribute("Enterprise", e);
                request.getRequestDispatcher("mainEnter.jsp").forward(request, response);
                return;
            }
        } 
        else if ( uName.equals("tunade170244@fpt.edu.vn") && pass.equals("admin")){
            request.getSession().setAttribute("admin", "tunade170244@fpt.edu.vn/admin");
            request.getRequestDispatcher("mainAdmin.jsp").forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
