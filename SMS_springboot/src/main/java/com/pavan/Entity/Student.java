package com.pavan.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int S_id;
	@Column
	String Name;
	@Column
	Long Phno;
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Long getPhno() {
		return Phno;
	}
	public void setPhno(Long phno) {
		Phno = phno;
	}
	@Override
	public String toString() {
		return "Student [S_id=" + S_id + ", Name=" + Name + ", Phno=" + Phno + "]";
	}
	public Student(int s_id, String name, Long phno) {
		super();
		S_id = s_id;
		Name = name;
		Phno = phno;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
