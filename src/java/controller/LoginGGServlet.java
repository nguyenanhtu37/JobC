/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import model.UserDB;
import org.apache.catalina.connector.InputBuffer;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author ASUS
 */
public class LoginGGServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private String code="";
    String access_token="";
    
     public LoginGGServlet()
    {
        super();
    }
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
            out.println("<title>Servlet LoginGGServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginGGServlet at " + request.getContextPath() + "</h1>");
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
        try {
            System.out.println("get");
            String code = request.getParameter("code");

            String urlParameters = "code ="
                    + code
                    + "&client_id=311060052304-v29rma73e6ji73uaroul7b4nft79iods.apps.googleusercontent.com"
                    + "&client_secret=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"
                    + "&redirect_uri=http://localhost:8080/SWP_JC/LoginGGServlet"
                    + "&grant_type=authorization_code";
            
            System.out.println(urlParameters);
            
            URL url = new URL("https://accounts.google.com/o/oauth2/token");
            URLConnection urlConn = url.openConnection();
            urlConn.setDoOutput(true);
            OutputStreamWriter write = new OutputStreamWriter(urlConn.getOutputStream());
            write.write(urlParameters);
            write.flush();
            System.out.println(url);
            String line , outpuString="";
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            while((line = reader.readLine())!=null){
                outpuString +=line;
            }
            System.out.println(outpuString);
            
            JSONObject gmailjson = new JSONObject(outpuString);
            
            User user = new User();
            user.setUserAccount(gmailjson.getString("email"));
            user.setUserName(gmailjson.getString("given_name"));
            user.setActivationFlag("A");
            user.setVerificationToken(access_token);
            user.setUserGmailId(gmailjson.getString("id"));
            user.setSignupFlag("G");
            user.setProfilePic(gmailjson.getString("picture"));
            
            UserDB userloginDB = new UserDB();
            System.out.println("check if 1");
            if(userloginDB.existsEmail(user)){
                System.out.println("check if 2");
                if(userloginDB.existsEmailAndFlag(user)){
                    User user1 = (User) userloginDB.getUserGG(user);
                    setUserSession(user1,request);
                    System.out.println("login and redirect to dashboard");
                    response.sendRedirect("main.jsp");
                }else {
                    System.out.println("check if 3");
                    HttpSession session = request.getSession();
                    session.setAttribute("errorMsg", "Wrong Login Type!You have been already registered with Facebook!Try with FB Login");
                    response.sendRedirect("index.html");
                    System.out.println("if-else");
                }
            }else{
                System.out.println("check if 4");
                userloginDB.addNewUserGG(user);
                setUserSession(user, request);
                response.sendRedirect("login.jsp");
                System.out.println("registered and dispatch to dashboard");
            }
            write.close();
            request.getRequestDispatcher("index.html").forward(request, response);
        } catch ( Exception e){
            System.out.println(e);
        }
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
        processRequest(request, response);
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
    
    
    public void  setUserSession(User user, HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("User", user);
    }
}
