package com.pavan.model;

public class StudentDetails {
 int st_id;
 String st_name;
 int st_dob;
public int getSt_id() {
	return st_id;
}
public void setSt_id(int st_id) {
	this.st_id = st_id;
}
public String getSt_name() {
	return st_name;
}
public void setSt_name(String st_name) {
	this.st_name = st_name;
}
public int getSt_dob() {
	return st_dob;
}
public void setSt_dob(int st_dob) {
	this.st_dob = st_dob;
}
@Override
public String toString() {
	return "StudentDetails [st_id=" + st_id + ", st_name=" + st_name + ", st_dob=" + st_dob + "]";
}
public StudentDetails(int st_id, String st_name, int st_dob) {
	super();
	this.st_id = st_id;
	this.st_name = st_name;
	this.st_dob = st_dob;
}
 
 
}
