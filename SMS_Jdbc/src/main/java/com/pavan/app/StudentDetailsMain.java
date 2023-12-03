package com.pavan.app;
import java.sql.*;

import com.pavan.methodsimpl.StudentDetailsImpl;

public class StudentDetailsMain extends StudentDetailsImpl {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		StudentDetailsMain stum=new StudentDetailsMain();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
		Statement stmnt =(Statement) connect.createStatement();
	//-----------------create--------------------------------
//		if(stmnt.executeUpdate("insert into details_tb values(8,'braty',2002)") == 1) {		
//		stum.createStudentRecord();
//		}else {
//			System.out.println("record not created");
//		}
		

	//------------------------update-------------------------------------
		
		if(stmnt.executeUpdate("update details_tb set st_dob=2002 where st_id=5")==1) {
			stum.updateStudentRecord();
		}else {
			System.out.println("record not updated");
		}
		
	//-----------------------------delete-----------------------------------------
		if(stmnt.executeUpdate("delete from details_tb where st_id=7")==1) {
			stum.deleteStudentRecord();
		}else {
			System.out.println("-record not deleted");
		}
		
	//---------------------------read--------------------------------
		
		ResultSet results=stmnt.executeQuery("select *from details_tb");
		while(results.next()) {
			String temp=results.getInt(1)+" "+results.getString(2)+" "+results.getInt(3);
			stum.readStudentsRecords(temp);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
