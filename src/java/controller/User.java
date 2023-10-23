package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/accountList")
public class User extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User accountDAO = new AccountDAO();
        List<Account> accounts = accountDAO.getAllAccounts();

        request.setAttribute("accounts", accounts);
        request.getRequestDispatcher("/accountList.jsp").forward(request, response);
    }
}
