package com.question3.Question3.controllers;

import com.question3.Question3.entities.Book;
import com.question3.Question3.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Bookcontroller {

    @Autowired
    private BookServices bookServices;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){

        List<Book> list = bookServices.getAllBook();
        if(list.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(list) ;
    }

    @PostMapping("/books")
    public ResponseEntity<Book> addBooks(@RequestBody Book book){
        Book b = null;
        try {
            b = this.bookServices.addBook(book);
            return ResponseEntity.of(Optional.of(b));
        }catch (Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/books/{bookid}")
    public ResponseEntity<Book> getBookByid(@PathVariable("bookid") String bookid){

        Book book = this.bookServices.getBookById(Integer.parseInt(bookid));
        if(book == null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }
}
