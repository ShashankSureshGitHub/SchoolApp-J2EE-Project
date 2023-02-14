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

@WebServlet(value = "/ups")
public class UpdateStudentStage2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int age = Integer.parseInt(req.getParameter("age"));
		Long phone = Long.parseLong(req.getParameter("phone"));
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setEmail(email);
		s.setAge(age);
		s.setPhone(phone);

		StudentCrud sc = new StudentCrud();
		boolean bo = sc.updateStudent(s);
		PrintWriter pw = resp.getWriter();
		if (bo) {
			RequestDispatcher rd = req.getRequestDispatcher("view");
			rd.forward(req, resp);

		} else {
			pw.print("Failed to update");
		}
	}
}
