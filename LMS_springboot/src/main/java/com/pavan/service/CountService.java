package com.pavan.service;

import java.util.List;

import com.pavan.model.Count;

public interface CountService{

	//Insert
	public Count createCount(Count co);
	
	//Read
	public List<Count> fetchCounList();
	
	//Update
	public Count updateCount(Count co,int b_id);
	
	//Delete
	public void deleteCount(int b_id);
}
