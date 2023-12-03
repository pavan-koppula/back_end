package com.LibraryImpl;

import com.LibraryMethods.BooksBorrowerMethod;

public class BooksBorrowerImpl implements BooksBorrowerMethod{

	@Override
	public void CreatBooksBorr() {
		// TODO Auto-generated method stub
		System.out.println("Record Created");
	}

	@Override
	public void ReadBooksBorr(String src) {
		// TODO Auto-generated method stub
		System.out.println(src);
	}

	@Override
	public void UpdateBooksBorr() {
		// TODO Auto-generated method stub
		System.out.println("Reacord Updated");
	}

	@Override
	public void DelateBooksBorr() {
		// TODO Auto-generated method stub
		System.out.println("Record Deleted");
	}

	@Override
	public void Error() {
		// TODO Auto-generated method stub
		System.out.println("Execution Failed");
	}

}
