package com.js.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.TeacherCrud;
import com.js.dto.Teacher;

@WebServlet(value="/teacher")
public class RegisterTeacher extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int age = Integer.parseInt(req.getParameter("age"));
		Long phone = Long.parseLong(req.getParameter("phone"));
		String qualification = req.getParameter("qualification");
		double salary = Double.parseDouble(req.getParameter("salary"));

		Teacher t = new Teacher();
		t.setName(name);
		t.setEmail(email);
		t.setAge(age);
		t.setPhone(phone);
		t.setQualification(qualification);
		t.setSalary(salary);

		TeacherCrud tc = new TeacherCrud();
		boolean b = tc.saveTeacher(t);
		PrintWriter pw = resp.getWriter();
		if (b) {
			pw.print("Registered Successfully");
		} else {
			pw.print("Registration failed");
		}

	}

}
