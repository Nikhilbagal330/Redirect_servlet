package com.nikhil_redirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sq extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("i"));
		
		i=i*i;
		PrintWriter out=res.getWriter();
		out.println("output is :"+i);
		
	}
	
	
}
