package com.pavan.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.Repository.BookRepo;
import com.pavan.model.Books;
import com.pavan.service.BookService;
@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepo bookRepo;
	@Override
	public Books insertBook(Books bk) {
		return bookRepo.save(bk);
	}

	@Override
	public List<Books> fetchBooks() {
		return (List<Books>) bookRepo.findAll();
	}

	@Override
	public Books updateBook(Books bk, int b_id) {
		Books b=bookRepo.findById(b_id).get();
		if(bk.getB_id()==b.getB_id()) {
			b.setB_name(bk.getB_name());
		}
		return bookRepo.save(bk);
	}

	@Override
	public void deleteBook(int b_id) {
		bookRepo.deleteById(b_id);
	}
	
}