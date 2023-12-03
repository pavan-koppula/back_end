package com.pavan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.model.Books;
import com.pavan.service.BookService;
@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	//Insert
	@PostMapping("/book")
	public Books insertBook(@RequestBody Books bk) {
		return bookService.insertBook(bk);
	}
	//Read
	@GetMapping("/book")
	public List<Books> fetchBooks(){
		return (List<Books>) bookService.fetchBooks();
	}
	//Update
	@PutMapping("/book/{id}")
	public Books updateBooks(@RequestBody Books bk, @PathVariable int b_id) {
		return bookService.updateBook(bk, b_id);
	}
	//Delete
	@DeleteMapping("/book/{id}")
	public String deleBooks(@PathVariable int b_id) {
		bookService.deleteBook(b_id);
		return "Delete Success";
	
	}
}
