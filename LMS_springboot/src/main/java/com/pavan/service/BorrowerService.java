package com.pavan.service;

import java.util.List;

import com.pavan.model.Borrower;

public interface BorrowerService {

	public Borrower insertBorrower(Borrower br);
	
	public List<Borrower> fetchBorrwerList();
	
	public Borrower updateBorrower(Borrower br, int b_id);
	
	public void deleteBorrower(int b_id);
}
