package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple authentication check (can be replaced with DB logic)
        if ("admin".equals(username) && "password".equals(password)) {
            response.sendRedirect("dashboard.jsp");  // Redirect to dashboard.jsp on success
        } else {
            response.sendRedirect("login.jsp");  // Redirect back to login on failure
        }
    }
}
