package com.pavan.service;

import java.util.List;

import com.pavan.Entity.Student;

public interface StudentService {
	
	 // save operation
	Student saveStudent(Student std);
	
	// read operation
	List<Student> fetchStudentList();
	
	// update operation
	Student updateStudent(Student std,int S_id);
	
	 // delete operation
	void deleteStudent(int s_id);
}
