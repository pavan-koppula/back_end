package comp.pavan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="details_tb")
public class Student {
	@Id
	@Column(name="st_id")
int id;
	@Column(name="st_name")
String name;
	@Column(name="st_dob")
int DOB;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDOB() {
	return DOB;
}
public void setDOB(int dOB) {
	DOB = dOB;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", DOB=" + DOB + "]";
}
public Student(int id, String name, int dOB) {
	super();
	this.id = id;
	this.name = name;
	DOB = dOB;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

}
