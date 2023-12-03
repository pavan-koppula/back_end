package com.pavan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Borrower {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int b_id;
	String borrName;
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getBorrName() {
		return borrName;
	}
	public void setBorrName(String borrName) {
		this.borrName = borrName;
	}
	@Override
	public String toString() {
		return "Borrower [b_id=" + b_id + ", borrName=" + borrName + "]";
	}
	public Borrower(int b_id, String borrName) {
		super();
		this.b_id = b_id;
		this.borrName = borrName;
	}
	public Borrower() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
