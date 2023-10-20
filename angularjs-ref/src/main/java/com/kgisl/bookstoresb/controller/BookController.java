package com.kgisl.bookstoresb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kgisl.bookstoresb.entity.Book;
import com.kgisl.bookstoresb.service.Bookservice;

@RestController
@CrossOrigin("*")
@RequestMapping("/books")
public class BookController {
    @Autowired
    private Bookservice bookservice;

    @GetMapping("/")
    public List<Book> getBooks() {
        System.out.println(bookservice.getBooks());
        return bookservice.getBooks();
    }

    @PostMapping("/create")
    public  Book createBook(@RequestBody Book book) {
        return bookservice.createBook(book);
    }

    @GetMapping("/get/{id}")
    public Optional<Book> getbookbyid(@PathVariable("id") Integer bookid) {
        return bookservice.getbookbyid(bookid);
    }

    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable("id") Integer bookid, @RequestBody Book inbook) {
        return bookservice.updateBook(inbook);
    }

    @DeleteMapping("/delete/{id}")
    public void deleBookbyid(@PathVariable("id") Integer bookid) {
        bookservice.deleBookbyid(bookid);
    }

}
