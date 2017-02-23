/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author QUANG IVIETTECH
 */
@WebServlet("/sendEmail")
public class EmailServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          PrintWriter out=resp.getWriter();
        //StringBuffer html = new StringBuffer();
        StringBuilder html=new StringBuilder();
        html.append("<!DOCTYPE html>");
        html.append("<html>");
        html.append("<head>").append("<title>Demo</title>");
        html.append("</head>");
        html.append("<body>").append("<p>Send Email!!</p>");
        html.append("</body>");
        html.append("</html>");
        out.println(html);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          PrintWriter out=resp.getWriter();
        //StringBuffer html = new StringBuffer();
        String email = req.getParameter("email"); //email lay tu name="email" trong index.html
        StringBuilder html=new StringBuilder();
        html.append("<!DOCTYPE html>");
        html.append("<html>");
        html.append("<head>").append("<title>Demo</title>");
        html.append("</head>");
        html.append("<body>").append(email).append("<p>Welcome!!!</p>");
        html.append("</body>");
        html.append("</html>");
        out.println(html);
    }
    
    
}
