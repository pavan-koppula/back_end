package com.pavan.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int s_id;
	String city;
	String Father_Name;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getFather_Name() {
		return Father_Name;
	}
	public void setFather_Name(String father_Name) {
		Father_Name = father_Name;
	}
	@Override
	public String toString() {
		return "Address [s_id=" + s_id + ", city=" + city + ", Father_Name=" + Father_Name + "]";
	}
	public Address(int s_id, String city, String father_Name) {
		super();
		this.s_id = s_id;
		this.city = city;
		Father_Name = father_Name;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
