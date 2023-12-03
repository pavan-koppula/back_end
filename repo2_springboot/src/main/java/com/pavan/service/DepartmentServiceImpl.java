package com.pavan.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.model.Department;
import com.pavan.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	public DepartmentRepository departmentrepository;
	
	//save operation
	@Override
	public Department saveDepartment(Department department) {
		return departmentrepository.save(department);
	}
    // read operation
	@Override
	public List<Department> fetchDepartmentList() {
		return (List<Department>) departmentrepository.findAll();
	}
    // update operation
	@Override
	public Department updateDepartment(Department department, Long departmentId) {
		 Department depDB = departmentrepository.findById(departmentId).get();
		 System.out.println(depDB.getDepartmentId());
		 if(department.getDepartmentId()== depDB.getDepartmentId()) {
			depDB.setDepartmentName(department.getDepartmentName());
			depDB.setDepartmentAddress(department.getDepartmentAddress());
			depDB.setDepartmentCode(department.getDepartmentCode());
		 }
		  
//	        if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
//	            depDB.setDepartmentName(department.getDepartmentName());
//	        }
//	  
//	        if (Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
//	            depDB.setDepartmentAddress(department.getDepartmentAddress());
//	        }
//	  
//	        if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
//	            depDB.setDepartmentCode(department.getDepartmentCode());
//	        }
	  
	        return departmentrepository.save(depDB);
	    }

	@Override
	public void deleteDepartmentById(Long departmentId) {
		 departmentrepository.deleteById(departmentId);
	}

}
