package com.project.library.controller;

import com.project.library.domain.Book;
import com.project.library.dtos.BookDTO;
import com.project.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping()
    public List<Book> listAll() {
        return this.bookService.getAllBooks();
    }

    @PostMapping()
    public Book createBook(@RequestBody BookDTO book) {
        Book newBook = bookService.createBook(book);
        return newBook;
    }
}
