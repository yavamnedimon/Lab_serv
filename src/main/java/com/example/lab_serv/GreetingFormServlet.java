package com.example.lab_serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/greeting-form")
public class GreetingFormServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");


        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Greeting Form</title></head>");
        out.println("<body>");
        out.println("<h2>Enter Your Name:</h2>");
        out.println("<form action='/hello' method='GET'>");
        out.println("    <label for='name'>Name:</label>");
        out.println("    <input type='text' id='name' name='name' required>");
        out.println("    <br>");
        out.println("    <input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}
