package com.pavan.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pavan.methodsimpl.StudentMarksImp;

public class StudentMarksMain extends StudentMarksImp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		StudentMarksMain stmain= new StudentMarksMain();
		
//get package of mysql
		Class.forName("com.mysql.cj.jdbc.Driver");
//establish connection
		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
		
		//Statement creation
		
		Statement stmnt = (Statement) conn.createStatement();
		
		//query writing
	//create============================================================	
		if(stmnt.executeUpdate("insert into markes_tb values (6,55,66,88)")==1) {
			stmain.createStdMarksRecord();
		}else {
			System.out.println("failed to create record");
		}

	//update=====================================================================
		if(stmnt.executeUpdate("update markes_tb set tel=100 where st_td=1")==1) {
			stmain.updateStdMarksRecord();
		}else {
			System.out.println("failed to update record");
		}
	//delete===================================================================
//		if(stmnt.executeUpdate("delete from markes_tb where st_td=6")==1) {
//			stmain.deleteStdMarksRecord();
//		}else {
//			System.out.println("failed to delete record");
//		}
		//read========================================================
		ResultSet result=stmnt.executeQuery("select *from markes_tb");
		if(result == null) {
			System.out.println("failed to fetch records");
		}else {
			while (result.next()) {
				String temp=result.getInt(1)+" "+result.getInt(2)+" "+result.getInt(3)+" "+result.getInt(4);
				stmain.readStdMarksRecord(temp);
				
			}
	}
	}

}
