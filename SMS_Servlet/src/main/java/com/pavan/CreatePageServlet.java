package com.pavan;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.crypto.Data;

/**
 * Servlet implementation class CreatePageServlet
 */
@jakarta.servlet.annotation.WebServlet("/CreatePageServlet")
public class CreatePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreatePageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(request.getParameter("id"));
		String b=request.getParameter("name");
		Integer c=Integer.parseInt(request.getParameter("dob"));
		String d=request.getParameter("address");
		String e=request.getParameter("email");
		PrintWriter out=response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
			Statement stm=(Statement) con.createStatement();
			
			if(stm.executeUpdate("insert into details_tb values("+a+",'"+b+"','"+c+"')")==1) {
				System.out.println("inserted");
				RequestDispatcher req=request.getRequestDispatcher("Sdone.html");
			}else {
				System.out.println("else");
				out.println("Creation Failed");
			}
			

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
