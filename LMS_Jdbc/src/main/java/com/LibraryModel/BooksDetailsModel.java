package com.LibraryModel;

public class BooksDetailsModel {
	int Bid;
	String Bname;
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	@Override
	public String toString() {
		return "BooksDetailsModel [Bid=" + Bid + ", Bname=" + Bname + "]";
	}
	public BooksDetailsModel(int bid, String bname) {
		super();
		Bid = bid;
		Bname = bname;
	}
	
}
