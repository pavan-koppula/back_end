package com.pavan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int b_id;
	@Column
	String b_name;
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	@Override
	public String toString() {
		return "Books [b_id=" + b_id + ", b_name=" + b_name + "]";
	}
	public Books(int b_id, String b_name) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
