package com.pavan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pavan.Entity.Marks;


public interface MarksService {
	
	// save operation
	public Marks saveMarks(Marks mar);
	
	//Read Operation
	public List<Marks> fetchMarksList();
	
	//Update Operation
	public Marks updateMarks(Marks mar,int s_id);
	
	//Delete Operation 
	void deleteMarks(int s_id);
}
