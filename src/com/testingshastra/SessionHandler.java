package com.testingshastra;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionHandler extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		 String uname=request.getParameter("username");
         String pass= request.getParameter("Password");
         HttpSession session = request.getSession();
         
         if(uname.equals("xyz") && pass.equals("1234")) {
        	 session.setAttribute("username", uname);
        	 response.sendRedirect("Welcome.jsp");
        }else {
        	 //response.getWriter().print("<font color='red' size='10'<b> Please enter valid Username & Password.....<b>");
        	 //response.sendRedirect("Home.jsp");
        	 //response.getWriter().print("<font color='red' size ='10'> <b> Please enter the valid username and password <b>");
        	 RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			  rd.include(request, response);
			  response.getWriter().print("<font color = 'red'><b>Please enter valid username and password.<b>");}
       }
	}
