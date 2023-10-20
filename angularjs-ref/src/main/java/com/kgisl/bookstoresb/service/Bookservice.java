package com.kgisl.bookstoresb.service;

// import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.bookstoresb.entity.Book;
import com.kgisl.bookstoresb.repo.Bookrepository;



@Service
public class Bookservice {

	// static List<Book> booklist = Arrays.asList(
	// new Book(1, "book1","b1"),
	// new Book(2, "book2","b2"),
	// new Book(3, "book3","b3")
	// );

	@Autowired
	private Bookrepository bookrepository;

	public List<Book> getBooks() {
		return bookrepository.findAll();
	}

	public Book createBook(Book book) {
		return bookrepository.save(book);
	}

	public Optional<Book> getbookbyid(Integer bookid) {
		return bookrepository.findById(bookid);
	}

	public Book updateBook(Book inbook) {
		return bookrepository.save(inbook);
	}

	public void deleBookbyid(Integer bookid) {
		bookrepository.deleteById(bookid);
	}

}
