package com.pavan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	int lid;
	String Lname;
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", Lname=" + Lname + "]";
	}
	public Laptop(int lid, String lname) {
		super();
		this.lid = lid;
		Lname = lname;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
