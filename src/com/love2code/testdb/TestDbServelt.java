package com.love2code.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServelt
 */
@WebServlet("/TestDbServelt")
public class TestDbServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String springUserNmae="jdbclearn";
		String springPwd="rejeesh";
		String jdbcUrl="jdbc:mysql://localhost:3306/web_customer_tracker";
		String driver="com.mysql.cj.jdbc.Driver";
		
		try
		{
			PrintWriter out=response.getWriter();
			out.println("Connecting to database :" + jdbcUrl);
			
			Class.forName(driver);
			Connection myConn=DriverManager.getConnection(jdbcUrl,springUserNmae,springPwd);
			out.println("Success");
			myConn.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new ServletException(e);
		}
		
		
	}

}
