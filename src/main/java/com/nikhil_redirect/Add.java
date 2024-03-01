package com.nikhil_redirect;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet{

		
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	int a= Integer.parseInt(req.getParameter("a1"));
	int b= Integer.parseInt(req.getParameter("a2"));
//	PrintWriter out=res.getWriter();
//	out.println();
     
	
	int l=a+b;
	
res.sendRedirect("twotwo?j="+20);	//url rewriting
}



}


