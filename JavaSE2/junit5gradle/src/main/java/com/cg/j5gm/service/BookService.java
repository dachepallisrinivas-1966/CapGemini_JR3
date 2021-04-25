package com.cg.j5gm.service;

import com.cg.j5gm.dao.IBookRepository;
import com.cg.j5gm.model.Book;


public class BookService {
	private IBookRepository bookRepository;

	public BookService(IBookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	
	public int findNumberOfBooks() {
		return bookRepository.findAll().size();
	}
}
