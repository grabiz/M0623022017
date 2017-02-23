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
//Bai tap ve nha lay du lieu form email,drop-down list, checkbox 
//1 file servlet chi phuc vu 1 url patterns
//Truyen data nhieu type ->post //update,insert vao database
//lay du lieu database de show->get
//get gioi han 2048 ky tu
//khong dung bien global trong java servlet request lau
//@WebServlet("/hello")
//@WebServlet("/hello/*")    //them dang sau url/hello/fdjfdfj -> ko bao loi
@WebServlet(urlPatterns={"/welcome","/hello"}) // url/welcome hay url/hello deu tra ve cung 1 trang
public class HelloServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        //StringBuffer html = new StringBuffer();
        StringBuilder html=new StringBuilder();
        html.append("<!DOCTYPE html>");
        html.append("<html>");
        html.append("<head>").append("<title>Demo</title>");
        html.append("</head>");
        html.append("<body>").append("<p>Hello World</p>");
        html.append("</body>");
        html.append("</html>");
        out.println(html);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
}
