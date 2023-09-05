package com.project.library.domain;

import com.project.library.dtos.BookDTO;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int pages;

    public Book(BookDTO data) {
        this.name = data.name();
        this.pages = data.pages();
    }

    public Book() {}

    public Book(Long id, String name, int pages) {
        this.id = id;
        this.name = name;
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
