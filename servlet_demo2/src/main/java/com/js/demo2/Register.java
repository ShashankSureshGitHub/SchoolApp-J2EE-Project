package com.js.demo2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Register extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");   // takes input from the html form to which we have given..
		String email=req.getParameter("email");
		int age=Integer.parseInt(req.getParameter("age"));
		long phone=Long.parseLong(req.getParameter("number"));
		PrintWriter pw=res.getWriter();                  // first method of giving response is using PrintWriter 
		pw.print("Welcome Mr/Mrs: "+name);
		pw.print("Your Email is: "+email);
		pw.print("Your age is: "+age);
		pw.print("your phone number is: "+phone);
		
	}

}
