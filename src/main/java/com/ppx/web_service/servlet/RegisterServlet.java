package com.ppx.web_service.servlet;

import com.ppx.web_service.dao.impl.LoginDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet",loadOnStartup = 1,urlPatterns = "/reg")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		boolean isSuccess = new LoginDAO().register(name,password);
		resp.getWriter().write(""+isSuccess);
	}
}
