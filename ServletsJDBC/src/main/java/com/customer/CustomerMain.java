package com.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/custurl")
public class CustomerMain extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public CustomerMain() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
		Integer id=Integer.parseInt(arg0.getParameter("id"));
		String name=arg0.getParameter("name");
		String phno=arg0.getParameter("phno");
		PrintWriter out =arg1.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/testingservlets","root","root");
			Statement stmnt=(Statement) con.createStatement();
			
			if((stmnt.executeUpdate("insert into customerlist values("+id+",'"+name+"','"+phno+"')"))==1) {
				out.println("Happy to shop with you "+name);
			}else {
				out.println("records not there");
			
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("class not found exception");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql exception");
			e.printStackTrace();
		}
		
	}
}
