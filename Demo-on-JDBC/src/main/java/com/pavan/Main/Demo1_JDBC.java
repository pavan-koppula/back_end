package com.pavan.Main;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

import com.mysql.cj.jdbc.Driver;

public class Demo1_JDBC {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");

		Statement stmnt =(Statement) connect.createStatement();

		
//		stmnt.executeUpdate("INSERT INTO details_tb values (6,'allen',2001)");
		stmnt.executeUpdate("delete from details_tb where st_id=6");
		
		 
			ResultSet results= stmnt.executeQuery("select *from details_tb");		
			while (results.next()) {
				System.out.println(results.getInt(1)+"  "+ results.getString(2)+" "+results.getInt(3));
				
			}
	
	}

}
