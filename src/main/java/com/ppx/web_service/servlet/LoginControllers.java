package com.ppx.web_service.servlet;

import com.alibaba.fastjson.JSONArray;
import com.ppx.web_service.dao.impl.LoginDAO;
import com.ppx.web_service.entity.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class LoginControllers {

	/*
	This is a LoginControl Servlet Package
	 */

}

@WebServlet(name = "Login", loadOnStartup = 1, urlPatterns = "/login")
class LoginControl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		LoginDAO loginDAO = new LoginDAO();
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		int id = loginDAO.login(name, password);
		PrintWriter pw = resp.getWriter();
		if (id == -1) {
			pw.write("Login failed!");
		} else {
			Login login = loginDAO.get(id);
			pw.write(JSONArray.toJSONString(login.getId()));
			req.setAttribute("userId", id);
		}
		pw.flush();
	}
}

@WebServlet(name = "Register",loadOnStartup = 1,urlPatterns = "/reg")
class RegisterControl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		boolean isSuccess = new LoginDAO().register(name,password);
		resp.getWriter().write(""+isSuccess);
	}
}