package com.example.lab_serv;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class GreetServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");


        if (name == null || name.isEmpty()) {
            name = "Guest";
        }

        String greeting = "Hello, " + name;

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Greeting Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>" + greeting + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
