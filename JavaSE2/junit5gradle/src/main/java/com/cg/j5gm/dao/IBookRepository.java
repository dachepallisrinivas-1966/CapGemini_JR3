package com.cg.j5gm.dao;

import java.util.Collection;

import com.cg.j5gm.model.Book;

public interface IBookRepository {
	void save(Book book);
	Collection<Book> findAll();
}
