package com.pavan.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
public class Employee {
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	int em_id;
@Column
	String e_name;
@Column
	int e_sal;
	public int getEm_id() {
		return em_id;
	}
	public void setEm_id(int em_id) {
		this.em_id = em_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getE_sal() {
		return e_sal;
	}
	public void setE_sal(int e_sal) {
		this.e_sal = e_sal;
	}
	@Override
	public String toString() {
		return "Employee [em_id=" + em_id + ", e_name=" + e_name + ", e_sal=" + e_sal + "]";
	}
	public Employee(int em_id, String e_name, int e_sal) {
		super();
		this.em_id = em_id;
		this.e_name = e_name;
		this.e_sal = e_sal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(e_name, e_sal, em_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(e_name, other.e_name) && e_sal == other.e_sal && em_id == other.em_id;
	}
	
}
