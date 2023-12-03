package com.pavan.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pavan.model.Employee;
@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
