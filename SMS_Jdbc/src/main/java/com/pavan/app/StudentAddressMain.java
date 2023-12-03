package com.pavan.app;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.pavan.methodsimpl.StdAddressImpl;

public class StudentAddressMain extends StdAddressImpl{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	//Creating a class to main Method 
StudentAddressMain stadm = new StudentAddressMain();

	//Importing MYSQL Package 
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//Connection 
	Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
	
	//Create Statement(Interface)  //.createStatement() method is used to Query 
	Statement stmnt=(Statement) conn.createStatement();


	
		while (true) {
			
		
		System.out.println("--------------------SELECT YOUR OPTION---------------");
		System.out.println("enter 1. to create student address record: ");
		System.out.println("enter 2. to Get all student addresses: ");
		System.out.println("enter 3. to update record: ");
		System.out.println("enter 4. to delete record: ");
		System.out.println("enter 9. to exit");
		
		Scanner scanf=new Scanner(System.in);
		int selectedoption = scanf.nextInt();

		
		switch (selectedoption) {
		case 1: {
			
			//--------------Create--------------
//			if(stmnt.executeUpdate("insert into address_tb values(6,'Vij',89897898)") == 1) {
//				stadm.CreatStdAddressRecord();
//			} else {
//				stadm.FailedMethod();
//			}
			break;
		}
		case 2:{
			//--------------------Read--------------------------
			ResultSet result = stmnt.executeQuery(" select * from address_tb");
			if(result == null) {
				stadm.FailedMethod();
			}else {
				while(result.next()) {
					String str=result.getInt(1)+" "+result.getString(2)+" "+result.getInt(3);
					stadm.ReadStdAddressRecord(str);
				}
			}
			break;
		}
		case 3:{

			//----------------update-----------------------
				if(stmnt.executeUpdate("update address_tb set city='Rsv' where st_id=3 ") == 1) {
					stadm.UpdateStdAddressRecord();
				}else {
					stadm.FailedMethod();
				}
				
				break;
		}
		case 4:{

			//---------------Delete--------------------------
				if(stmnt.executeUpdate("delete from address_tb where st_id=2 ")==1) {
					stadm.DeleteStdAddressRecord();
				}else {
					stadm.FailedMethod();
				}
				break;
		}
		case 9:{
			System.out.println("thanks for using SMS: ");
			System.exit(0);
		}
		default:
			System.out.println("wrong selection");
			break;
		}
		}
	}

}
