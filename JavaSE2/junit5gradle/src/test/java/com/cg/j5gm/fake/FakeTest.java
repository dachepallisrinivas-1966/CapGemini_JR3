package com.cg.j5gm.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.cg.j5gm.dao.IBookRepository;
import com.cg.j5gm.fake.dao.FakeBookRepository;
import com.cg.j5gm.model.Book;
import com.cg.j5gm.service.BookService;

public class FakeTest {

	@Test
	public void testFake() {
		IBookRepository bookRepository = new FakeBookRepository();
		BookService bookService = new BookService(bookRepository);
		
		bookService.addBook(new Book("1234", "Mockito In Action", 250, LocalDate.now()));
		bookService.addBook(new Book("5678", "JUnit 5 In Action", 150, LocalDate.now()));
		
		assertEquals(2, bookService.findNumberOfBooks());
	}
}
