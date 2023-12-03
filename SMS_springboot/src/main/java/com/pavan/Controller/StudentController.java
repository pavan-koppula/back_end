package com.pavan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.Entity.Student;
import com.pavan.service.StudentService;

@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
	private StudentService StudentSer;
	
	 // Save operation
	@PostMapping("/Student")
	public Student saveStudent(@RequestBody Student std) {
		return StudentSer.saveStudent(std);
		
	}
	// Read operation
	@GetMapping("/Students")
	public List<Student> fetchStudentList()
	{
		return StudentSer.fetchStudentList();
	}
	// Update operation
	@PutMapping("/Student/{id}")
	public Student updateStudent(@PathVariable("id") Integer S_id, @RequestBody Student std) {
		
		return StudentSer.updateStudent(std, S_id);
	}
	
	
	 // Delete operation
	@DeleteMapping("/Student/{id}")
	public String deleteStudent(@PathVariable("id") Integer S_id) {
		StudentSer.deleteStudent(S_id);
		return "Delete Successfully";
	}
}
