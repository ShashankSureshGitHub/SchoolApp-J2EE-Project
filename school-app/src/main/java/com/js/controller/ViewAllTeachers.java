package com.js.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.TeacherCrud;
import com.js.dto.Teacher;

@WebServlet(value = "/viewallteachers")
public class ViewAllTeachers extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TeacherCrud tc = new TeacherCrud();
		List<Teacher> teachers = tc.getAllTeachers();
		if (teachers.size() > 0) {
			RequestDispatcher rd = req.getRequestDispatcher("viewallteachers.jsp");
			req.setAttribute("teacherslist", teachers);
			rd.forward(req, resp);
		} else {
			PrintWriter pw = resp.getWriter();
			pw.print("No teachers registered");
		}
	}
}
