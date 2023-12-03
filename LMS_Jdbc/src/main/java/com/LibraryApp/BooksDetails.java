package com.LibraryApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.LibraryImpl.BooksDetailsImpl;

public class BooksDetails extends BooksDetailsImpl {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		BooksDetails bd= new BooksDetails();
		
		//-----------Importing MSQL---------------
		Class.forName("com.mysql.cj.jdbc.Driver");
		//-----JDBC Connection--------------
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_db","root","root");
	//--------------Create Statement-------------
	Statement stmt=(Statement) con.createStatement();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("------------Select OPtions----------");
	System.out.println("Select 1 to Create Record");
	System.out.println("Select 2 to Reade Data");
	System.out.println("Select 3 to Update Record");
	System.out.println("Select 4 to Delete Record");
	System.out.println("Select 5 to Exit");
	
	while(true) {
	
	int option=sc.nextInt();
	switch(option) {
	case 1:{
	//--------Create--------------
	if(stmt.executeUpdate("insert into booksdetails_tb values(7,'SQL')") == 1) {
		bd.Error();
	}else {
		bd.CreateBooksDetails();
	}break;
	}
	case 2:{
	//---------Read--------------
	ResultSet result=stmt.executeQuery("select * from booksdetails_tb;");
	if(result==null) {
		bd.Error();
	}else {
		while(result.next()) {
			String str=result.getInt(1)+" "+result.getString(2);
			bd.ReadeBooksDetails(str);
		}
	}break;
	}
	case 3:{
	//-------------update--------------------
	if(stmt.executeUpdate("update booksdetails_tb set bname='ADBMS' where id=1")==1) {
		bd.UpdateBooksDetails();
	}else {
		bd.Error();
	}break;
	}
	case 4:{
	//-------------Delete---------------------
	if(stmt.executeUpdate("delete from booksdetsils_tb where id=2")== 1) {
		bd.DeleteBooksDetails();
	}else {
		bd.Error();
	}
	break;
	}
	case 5:{
		System.out.println("You are Exite");
		System.exit(0);
	}
	default:{
		System.out.println("Wrong Option");
		break;
	}
	}
	}
	}
}