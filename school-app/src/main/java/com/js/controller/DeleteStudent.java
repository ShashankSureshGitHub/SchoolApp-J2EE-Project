package com.js.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.StudentCrud;

@WebServlet(value = "/delete")
public class DeleteStudent extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		StudentCrud sc = new StudentCrud();
		boolean b = sc.deleteStudentById(id);
		if (b) {
			RequestDispatcher rd = req.getRequestDispatcher("view"); // from one servlet to another servlet using its
																		// url
			rd.forward(req, resp);
		} else {
			PrintWriter pw = resp.getWriter();
			pw.print("Failed to delete student");
		}
	}

}
