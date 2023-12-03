package com.LibraryApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.LibraryImpl.BooksCountImpl;

public class BooksCount extends BooksCountImpl {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		BooksCount bc=new BooksCount();
		
		//-------Importing MYSQL---------
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//-----JDBC Connection--------------
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_db\",\"root\",\"root");
		
		//-------------Statement Creation---------
		Statement stmt=(Statement) con.createStatement();
		
		//--------------create--------------------
		if(stmt.executeUpdate("insert into bookscount_tb values(7,10,15)")==1) {
			bc.CreateBookCount();
		}else {
			bc.Error();
		}
		//--------------Read------------
		ResultSet result=stmt.executeQuery("select * from bookscount_t;");
		if(result==null) {
			bc.Error();
		}else {
			while(result.next()) {
				String str=result.getInt(1)+" "+result.getInt(2)+" "+result.getInt(3);
				bc.ReadeBooksCount(str);
			}
		}
		//------------Update--------------
		if(stmt.executeUpdate("update bookscount_tb set BCount=5 where id=3")==1) {
			bc.UpdateBooksCount();
		}else {
			bc.Error();
		}
		//-----------Delete--------------
		if(stmt.executeUpdate("delete from bookcount_tb where id=5")==1) {
			bc.DeleteBooksCount();
		}else {
			bc.Error();
		}
	}

}
