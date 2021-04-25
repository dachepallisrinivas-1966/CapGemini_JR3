package com.cg.j5gm.fake.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.j5gm.dao.IBookRepository;
import com.cg.j5gm.model.Book;

public class FakeBookRepository implements IBookRepository {
	// in-memory database, hashmap or list
	Map<String, Book> bookStore = new HashMap<>();
	
	@Override
	public void save(Book book) {
		bookStore.put(book.getBookId(), book);

	}

	@Override
	public Collection<Book> findAll() {
		return bookStore.values();
	}

}
