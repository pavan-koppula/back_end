package com.pavan.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pavan.repositoryimpl.EmployeeReopImpl;

@SpringBootApplication
public class EmployeeApp extends EmployeeReopImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeApp app = new EmployeeApp();
//		app.saveEmployee();
		app.getEmployees();
		

	}

}
