package com.LibraryImpl;

import com.LibraryMethods.BooksCountMethod;

public class BooksCountImpl implements BooksCountMethod {

	@Override
	public void CreateBookCount() {
		// TODO Auto-generated method stub
		System.out.println("Record Created");
	}

	@Override
	public void ReadeBooksCount(String res) {
		// TODO Auto-generated method stub
		System.out.println(res);
	}

	@Override
	public void UpdateBooksCount() {
		// TODO Auto-generated method stub
		System.out.println("Record Updated");
	}

	@Override
	public void DeleteBooksCount() {
		// TODO Auto-generated method stub
		System.out.println("Record Deleted");
	}

	@Override
	public void Error() {
		// TODO Auto-generated method stub
		System.out.println("Exeecution Failed");
	}

}
