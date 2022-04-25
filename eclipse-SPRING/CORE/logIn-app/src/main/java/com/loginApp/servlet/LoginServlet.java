package com.loginApp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.loginApp.DAO.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname=request.getParameter("name");
		String upwd=request.getParameter("pwd");
		UserService us=new UserService();

	}
}
