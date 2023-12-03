package com.LibraryImpl;

import com.LibraryMethods.BooksDetailsMethod;

public class BooksDetailsImpl implements BooksDetailsMethod {
	
	@Override
	public void CreateBooksDetails() {
		// TODO Auto-generated method stub
		System.out.println("Record Created");
	}

	@Override
	public void ReadeBooksDetails(String res) {
		// TODO Auto-generated method stub
		System.out.println(res);
	}

	@Override
	public void UpdateBooksDetails() {
		// TODO Auto-generated method stub
		System.out.println("Record Updated");
	}

	@Override
	public void DeleteBooksDetails() {
		// TODO Auto-generated method stub
		System.out.println("Record Deleted");
	}

	@Override
	public void Error() {
		// TODO Auto-generated method stub
		System.out.println("Execution Failed");
	}

}
