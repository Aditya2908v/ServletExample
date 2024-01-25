package com.example.servletexample2;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int principalAmount = Integer.parseInt(request.getParameter("amt"));
        int rate = Integer.parseInt(request.getParameter("rate"));
        int time = Integer.parseInt(request.getParameter("time"));

        double simpleInterest = (double) (principalAmount * rate * time)/100;

        //System.out.println(compoundInterest);

        request.setAttribute("result", simpleInterest);

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }


}