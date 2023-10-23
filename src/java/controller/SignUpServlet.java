package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static model.ActivationCodeGenerator.generateActivationCode;
import model.EmailUtil;
import model.Enterprise;
import model.User;

public class SignUpServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SignUpServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignUpServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String activationCode = generateActivationCode();
        String email = request.getParameter("email-input").trim();
        String pass = request.getParameter("pass-input").trim();
        String confirm = request.getParameter("confirm-input").trim();
        String role = request.getParameter("role-input").trim();

        String[] inputArray = {email, pass, role};
        if (isEmptyInput(inputArray)) {
            request.setAttribute("inputError", "Must fill all input!");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
            return;
        } else if (!isConfirmedPassword(pass, confirm)) {
            request.setAttribute("inputError", "Confirm incorrect password!");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
            return;
        }

        int id = -1;
        if (role.equals("User")) {
            User u = new User(email, pass);
            if (u.isDupplicatedAccount()) {
                request.setAttribute("inputError", "Account is used. Try another one!");
                request.getRequestDispatcher("signup.jsp").forward(request, response);
                return;
            }
//            request.setAttribute("userdont", u);

        } else if (role.equals("Enterprise")) {
            Enterprise e = new Enterprise(email, pass);
            if (e.isDupplicatedAccount()) {
                request.setAttribute("inputError", "Account is used. Try another one!");
                request.getRequestDispatcher("signup.jsp").forward(request, response);
                return;
            }
//            request.setAttribute("enterdont", e);

        }
        HttpSession session = request.getSession();
        session.setAttribute("emaildont", email);
        session.setAttribute("passdont", pass);
        session.setAttribute("role", role);
        session.setAttribute("codetest", activationCode);
        
        EmailUtil.sendActivationEmail(email, activationCode);
        response.sendRedirect("VerifyServlet");

    }

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

    public static boolean isConfirmedPassword(String pass, String confirm) {
        if (confirm.equals(pass)) {
            return true;
        }
        return false;
    }
}
    