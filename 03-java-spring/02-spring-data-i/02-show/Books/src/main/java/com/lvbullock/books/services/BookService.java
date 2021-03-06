package com.lvbullock.books.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lvbullock.books.models.Book;
import com.lvbullock.books.repositories.BookRepository;

@Service
public class BookService {
	//Dependency Injection
	private BookRepository bookRepo;  //gives is access to the Repository
	
	public BookService(BookRepository repo) {
		this.bookRepo = repo;
	}
	
	//CRUD :  C = Create  R = Read   U = Update   D = Delete
	
	//Get All Books
	public List<Book> getAllBooks(){
		return this.bookRepo.findAll();
	}
	
	//Create A Book
	public Book createBook(Book newBook) {
		return this.bookRepo.save(newBook);
	}
	
	//Get One Book (Read)
	public Book getSingleBook(Long id) {
		return this.bookRepo.findById(id).orElse(null); //id is an optional(a boolean) (return everything or nothing)
	}

//	//Update A Book
//	public Book updateBook(Book updatedBook) {
//		return this.bookRepo.save(updatedBook);
//	}
//	
//	//Delete A Book
//	public String deleteBook(Long id) {  //note:  not public Book here because we are returning a string confirmation
//		this.bookRepo.deleteById(id);
//		return "Book " + id + " has been deleted"; //confirms that the Record has been deleted
//	}
	
	//Create object with parameters -- this is the old way
	public Book createBookOldway(String title, String description, String language, int numberOfPages) {
		Book newBook = new Book(title, description, language, numberOfPages);
		return this.bookRepo.save(newBook);
	}
}
