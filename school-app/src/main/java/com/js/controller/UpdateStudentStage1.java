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
import com.js.dto.Student;

@WebServlet(value = "/update")
public class UpdateStudentStage1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		StudentCrud sc = new StudentCrud();
		Student s = sc.getStudentById(id);
		if (s != null) {
			RequestDispatcher rd = req.getRequestDispatcher("updatestudent.jsp");
			req.setAttribute("updatestu", s);
			rd.forward(req, resp);
		} else {
			PrintWriter pw = resp.getWriter();
			pw.print("Failed to update");
		}
	}
}
