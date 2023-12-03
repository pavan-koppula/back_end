package com.LibraryModel;

public class BooksBorrowerModel {
	int Bid;
	String BBName;
	public BooksBorrowerModel(int bid, String bBName) {
		super();
		Bid = bid;
		BBName = bBName;
	}
	@Override
	public String toString() {
		return "BooksBorrowerModel [Bid=" + Bid + ", BBName=" + BBName + "]";
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBBName() {
		return BBName;
	}
	public void setBBName(String bBName) {
		BBName = bBName;
	}
}
