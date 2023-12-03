package com.pavan.repositoryimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.pavan.model.Employee;
import com.pavan.repository.EmployeeRepo;
@Primary
public class EmployeeReopImpl {
	@Autowired
	public EmployeeRepo repo;
	
//	public void saveEmployee() {
//		Employee em= new Employee();
//		em.setE_name("ravi");
//		em.setE_sal(2000);
//		em.setEm_id(0);
//		repo.save(em);
//	}
	
	public void getEmployees() {
	System.out.println(repo.findById(0));
		
	}

}
