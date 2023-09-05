package com.project.library.service;

import com.project.library.domain.Book;
import com.project.library.dtos.BookDTO;
import com.project.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public void save(Book book) {
        this.repository.save(book);
    }

    public Book createBook(BookDTO data) {
        Book newBook = new Book(data);
        this.save(newBook);
        return newBook;
    }

    public List<Book> getAllBooks() {
        return this.repository.findAll();
    }
}
