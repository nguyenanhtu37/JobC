package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Enterprise;
import model.User;

public class VerifyServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VerifyServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VerifyServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("Verify.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String inputcode = request.getParameter("input-code").trim();
        String emaildont = (String) session.getAttribute("emaildont");
        String passdont = (String) session.getAttribute("passdont");
        int id = -1;
        if (inputcode.equals(session.getAttribute("codetest")) && "User".equals(session.getAttribute("role"))) {
            User u = new User(emaildont, passdont);
            if(u.isDupplicatedAccount()){
                request.setAttribute("inputError", "Account is used. Try another one!");
                request.getRequestDispatcher("signup.jsp").forward(request, response);
            }
            id = u.addNew();
        } else if (inputcode.equals(session.getAttribute("codetest")) && "Enterprise".equals(session.getAttribute("role"))) {
            Enterprise e = new Enterprise(emaildont, passdont);
            if(e.isDupplicatedAccount()){
                request.setAttribute("inputEnrror", "Account is used. Try another one!");
            }
            id = e.addNew();
        } else if(!inputcode.equals(session.getAttribute("codetest"))){
            request.setAttribute("inputError", "Incorrect code");
            request.getRequestDispatcher("Verify.jsp").forward(request, response);
        }

        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
