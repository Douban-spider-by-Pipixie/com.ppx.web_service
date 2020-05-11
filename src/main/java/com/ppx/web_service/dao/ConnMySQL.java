package com.ppx.web_service.dao;

import com.mysql.cj.xdevapi.Statement;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnMySQL {
	private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static String DB_URL = "jdbc:mysql://cdb-e0agigrr.gz.tencentcdb.com:10087/test1.0";
	private static String USER = "root";
	private static String PASS = "16251425Zyq";
	private Connection conn = null;

	public boolean getConn(){
		try{
			Class.forName(JDBC_DRIVER);
			System.out.println("正在连接数据库···");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			Statement stmt = (Statement) conn.createStatement();
			System.out.println("连接成功！");
			return true;

		}catch (Exception e){
			e.printStackTrace();
			System.out.println("连接失败！");
			return false;
		}
	}
}
