/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Enterprise;
import model.Job;

/**
 *
 * @author ASUS
 */
public class PostJobServlet extends HttpServlet {

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
            out.println("<title>Servlet PostJobServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PostJobServlet at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("PostJob.jsp").forward(request, response);

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
        String jobtitle = request.getParameter("title-input").trim();
        String dateopen = request.getParameter("dateopen-input").trim();
        String dateclose = request.getParameter("dateclose-input").trim();
        String location = request.getParameter("location-input").trim();
        String type = request.getParameter("type-input").trim();
        String Salary = request.getParameter("salary-input").trim();
        String desc = request.getParameter("desc-input").trim();
        String skill = request.getParameter("skill-input").trim();

        HttpSession session = request.getSession();
        Enterprise e = (Enterprise) session.getAttribute("Enterprise");
        String enterpriseId = e.getEnterpriseID();
       
        
        String[] inputArray = {jobtitle, dateopen, dateclose, location, type, desc, skill,enterpriseId, Salary};
        if (isEmptyInput(inputArray)) {
            request.setAttribute("inputError", "Must fill all input");
            request.getRequestDispatcher("PostJob.jsp").forward(request, response);
            return;
        }

        int id = -1;
        java.sql.Date dtopen = formatDate(dateopen);
        java.sql.Date dtclose = formatDate(dateclose);

        Job j = new Job(jobtitle, dtopen, dtclose, location, type, desc, skill, Salary,enterpriseId);
        id = j.addNew();

        request.getRequestDispatcher("mainEnter.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public static boolean isEmptyInput(String[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static java.sql.Date formatDate(String str) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date result = null;
        try {
            result = new java.sql.Date(sdf.parse(str).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(SignUpServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
