package com.js.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/login") // mapping to url
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		resp.setContentType("text/html");
		if (email.equals("shank@gmail.com") && password.equals("1234")) {
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.forward(req, resp);
		} else {
			PrintWriter pw = resp.getWriter();
			pw.print("Email or password wrong");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);

		}

	}

}
// doPost method:is used to hide credentials in the url....method type should be mentioned in the form...method="post"
