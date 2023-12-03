package com.pavan.ServiceImpl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.Entity.Student;
import com.pavan.repository.StudentRepo;
import com.pavan.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo Studentrepo;
	
	@Override
	//Save Operation
	public Student saveStudent(Student std) {
		return Studentrepo.save(std);
	}
	
	//Read Operation
	@Override
	public List<Student> fetchStudentList() {
		return (List<Student>) Studentrepo.findAll();
	}
	
	//Update operation
	@Override
	public Student updateStudent(Student std, int S_id) {
		Student st=Studentrepo.findById(S_id).get();
		if(std.getS_id() == st.getS_id()) {
			st.setName(std.getName());
			st.setPhno(std.getPhno());
		
		}	
	return Studentrepo.save(st);
	}

	//Delete Operation
	@Override
	public void deleteStudent(int S_id) {
		// TODO Auto-generated method stub
		Studentrepo.deleteById(S_id);
	}

}
