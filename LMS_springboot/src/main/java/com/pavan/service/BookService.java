package com.pavan.service;


import java.util.List;

import com.pavan.model.Books;

public interface BookService {

	//Insert method
		public Books insertBook(Books bk);
		
	//Read Method
		public List<Books> fetchBooks();
	
	//Update Method
		public Books updateBook(Books bk, int b_id);
		
	//Delete Method
		void deleteBook(int b_id);
}
