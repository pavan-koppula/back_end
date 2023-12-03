package com.pavan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Count {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int b_id;
	int b_count;
	int b_org_count;
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public int getB_count() {
		return b_count;
	}
	public void setB_count(int b_count) {
		this.b_count = b_count;
	}
	public int getB_org_count() {
		return b_org_count;
	}
	public void setB_org_count(int b_org_count) {
		this.b_org_count = b_org_count;
	}
	@Override
	public String toString() {
		return "Count [b_id=" + b_id + ", b_count=" + b_count + ", b_org_count=" + b_org_count + "]";
	}
	public Count(int b_id, int b_count, int b_org_count) {
		super();
		this.b_id = b_id;
		this.b_count = b_count;
		this.b_org_count = b_org_count;
	}
	public Count() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
