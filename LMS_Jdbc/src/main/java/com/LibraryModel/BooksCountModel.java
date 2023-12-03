package com.LibraryModel;

public class BooksCountModel {
	int Bid;
	String Bcount;
	int Boriginal;
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBcount() {
		return Bcount;
	}
	public void setBcount(String bcount) {
		Bcount = bcount;
	}
	public int getBoriginal() {
		return Boriginal;
	}
	public void setBoriginal(int boriginal) {
		Boriginal = boriginal;
	}
	public BooksCountModel(int bid, String bcount, int boriginal) {
		super();
		Bid = bid;
		Bcount = bcount;
		Boriginal = boriginal;
	}
	@Override
	public String toString() {
		return "BooksCountModel [Bid=" + Bid + ", Bcount=" + Bcount + ", Boriginal=" + Boriginal + "]";
	}
}
