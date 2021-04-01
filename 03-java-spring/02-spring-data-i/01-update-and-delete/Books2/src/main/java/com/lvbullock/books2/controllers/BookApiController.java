package com.lvbullock.books2.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvbullock.books2.models.Book;
import com.lvbullock.books2.services.BookService;

@RestController //RestController only good for API
@RequestMapping("api/books")
public class BookApiController {
	private BookService bookService;
	
	public BookApiController(BookService service) {
		this.bookService = service;
	}
	
	//ROUTES:
	
	//Get All Books

	@RequestMapping("")
	public List<Book> index(){
		return this.bookService.getAllBooks();
	}
	
	
	//Get One Book (Read)
	@RequestMapping("/{id}")  //Get Request
	public Book getBook(@PathVariable("id") Long id) {
		return this.bookService.getSingleBook(id);
	}
	
	//Create A Book
	@RequestMapping(value="/", method=RequestMethod.POST) //Post Request
	public Book create(Book book) {
		return this.bookService.createBook(book);
	}

	//Update a Book
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public Book edit(@PathVariable("id") Long id, Book updatedBook) {
		return this.bookService.updateBook(updatedBook);
	}

	//Delete a Book
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteBook(@PathVariable("id") Long id) {
		this.bookService.deleteBook(id);
	}
}
