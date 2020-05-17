package com.ppx.web_service.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ParamsTestServlet", loadOnStartup = 1,urlPatterns = "/paramTest")
public class ParamsTestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		String type = req.getParameter("type");
		String test = req.getParameter("test");

		//Map paramMap = request.getParameterMap();
		//String[] paramArray = request.getParameterValues("paramName");

		PrintWriter pw = resp.getWriter();
		pw.write("Type: "+ type+" </br>");
		pw.write("Test: "+test+" </br>");
		pw.flush();
	}
}
