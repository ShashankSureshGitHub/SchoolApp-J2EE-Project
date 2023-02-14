package com.js.demo2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		res.setContentType("text/html");
		if(email.equals("shank@gmail.com") && password.equals("1234"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("welcome.html");
			rd.forward(req, res);
		}
		else
		{
			PrintWriter pw=res.getWriter();
			pw.print("Email or password wrong");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
			
		}
		
	}

}

//Disadvantages of GenericServlet
// only one way to give response i.e Service method
// credentials are visible in the url