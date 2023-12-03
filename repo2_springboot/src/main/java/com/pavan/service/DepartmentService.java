package com.pavan.service;

import java.util.List;

import com.pavan.model.Department;

public interface DepartmentService {
	
	// save operation
	                 //Method Name  //Class    
	public Department saveDepartment(Department department);
	
	// read operation
	                        //Method Name
	public List<Department> fetchDepartmentList();
	
	// update operation
											
									   //Class			 		    //Variable
	public Department updateDepartment(Department department, Long departmentId );
	
	// delete operation
	void deleteDepartmentById(Long departmentId);
	
	
	
	
}
