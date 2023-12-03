package com.pavan.methodsimpl;

import com.pavan.methods.StudentsMarksMethods;

public class StudentMarksImp implements StudentsMarksMethods{

	@Override
	public void createStdMarksRecord() {
		// TODO Auto-generated method stub
		System.out.println("Record created");
		
	}

	@Override
	public void readStdMarksRecord(String res) {
		// TODO Auto-generated method stub
		System.out.println(res);
	}

	@Override
	public void updateStdMarksRecord() {
		// TODO Auto-generated method stub
		System.out.println("record updated");
	}

	@Override
	public void deleteStdMarksRecord() {
		// TODO Auto-generated method stub
		System.out.println("record deleted");
	}


}
