package com.ppx.web_service.servlet;

import com.alibaba.fastjson.JSONArray;
import com.ppx.web_service.dao.impl.TagDAO;
import com.ppx.web_service.service.impl.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class TestControllers {
}

@WebServlet(name = "ParamsTest", loadOnStartup = 1,urlPatterns = "/test")
class ParamsControl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		String test = req.getParameter("p");
		String json = null;
		if(test.equals("getbook")){
			UserService service = new UserService();
			json = service.showRandomBooks();
		}
		if(test.equals("hottag")){
			TagDAO tagDAO = new TagDAO();
			json = JSONArray.toJSONString(tagDAO.getHotTag());
		}

		//Map paramMap = request.getParameterMap();
		//String[] paramArray = request.getParameterValues("paramName");

		PrintWriter pw = resp.getWriter();
		//pw.write("Type: "+ type+" </br>");
		//pw.write("Test: "+test+" </br>");
		pw.write(json);
		pw.flush();
	}
}
