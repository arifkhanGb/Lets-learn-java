package com.api.book.bootrestbook.services;

import com.api.book.bootrestbook.entities.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();

    public Book getBook(int bookid);
    public Book addBooks(Book book);

    public Book updatebook(int bookId , Book book);
    public void deleteBook(int bookId);
}
