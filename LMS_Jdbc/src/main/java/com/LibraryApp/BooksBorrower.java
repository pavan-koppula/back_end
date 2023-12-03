package com.LibraryApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.LibraryImpl.BooksBorrowerImpl;

public class BooksBorrower extends BooksBorrowerImpl{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		BooksBorrower bb=new BooksBorrower();
		
		//-------------Importing MYSQL-------------
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//-------------JDBC Connectivity-----------
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_db\\\",\\\"root\\\",\\\"root");
		
		//-----------Statement-----------------
		Statement stm=(Statement) con.createStatement();
		
		//------------Create Record----------------
		if(stm.executeUpdate("insert into booksborr_tb values(7,'alexa')")==1) {
			bb.CreatBooksBorr();
		}else {
			bb.Error();
			
		//------------Read-------------------------
		ResultSet result=stm.executeQuery("select * from bookborr_tb");
		if(result==null) {
			bb.Error();
		}else {
			while(result.next()) {
				String src=result.getInt(1)+" "+result.getString(2);
				bb.ReadBooksBorr(src);
			}
		}
		}
		//---------------Update-----------------
		if(stm.executeUpdate("update booksborr_tb set BorrName='aaaa' where id=3")==1) {
			bb.UpdateBooksBorr();
		}else {
			bb.Error();
		}
		//--------------Delete-----------------
		if(stm.executeUpdate("delete from booksborr_tb where id=5")==1) {
			bb.DelateBooksBorr();
		}else {
			bb.Error();
		}
		
	}
	

}

