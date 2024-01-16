package com.question3.Question3.services;

import com.question3.Question3.entities.Book;
import com.question3.Question3.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BookServices {


    @Autowired
    BookRepository bookRepository;


    public List<Book> getAllBook(){

       List<Book> allBook=bookRepository.findAll();
        return allBook;
    }

    public Book addBook(Book book){
       return bookRepository.save(book);

    }

    public Book getBookById(int id){
        Book book = null;
        try {
            book = this.bookRepository.findById(id);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
       return book;

    }
}
