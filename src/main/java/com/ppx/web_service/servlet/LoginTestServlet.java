package com.ppx.web_service.servlet;

import com.ppx.web_service.dao.impl.LoginDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginTestServlet",loadOnStartup = 1,urlPatterns = "/loginTest")
public class LoginTestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		LoginDAO loginDAO = new LoginDAO();
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		int id = loginDAO.login(name,password);
		PrintWriter pw = resp.getWriter();
		if(id==-1){
			pw.write("Login failed!");
		}else {
			pw.write("Your ID is:"+id);
		}
		pw.flush();
	}
}


