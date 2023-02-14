package com.js.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/login")
public class Login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		Cookie c=new Cookie("a", "cookieee");
		resp.addCookie(c);
		if (email.equals("shank@gmail.com") && password.equals("1234")) {
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);
		} else {
			PrintWriter pw = resp.getWriter();
			pw.print("Email or password wrong");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.include(req, resp);

		}

	}

}
