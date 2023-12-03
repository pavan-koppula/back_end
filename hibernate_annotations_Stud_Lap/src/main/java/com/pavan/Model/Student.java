package com.pavan.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Student {
	@Id
	int rollno;
	String name;
	int marks;
	@OneToMany
	List<Laptop> lap=new ArrayList<Laptop>();
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public List<Laptop> getLap() {
		return lap;
	}
	public void setLap(List<Laptop> lap) {
		this.lap = lap;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", lap=" + lap + "]";
	}
	public Student(int rollno, String name, int marks, List<Laptop> lap) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.lap = lap;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}