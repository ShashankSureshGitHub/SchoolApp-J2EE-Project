package com.js.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.TeacherCrud;

@WebServlet(value = "/deleteteacher")
public class DeleteTeacher extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		TeacherCrud tc = new TeacherCrud();
		boolean bo = tc.deleteTeacherById(id);
		if (bo) {
			RequestDispatcher rd = req.getRequestDispatcher("viewallteachers");
			rd.forward(req, resp);
		} else {
			PrintWriter pw = resp.getWriter();
			pw.print("Failed to delete teacher");
		}
	}

}
