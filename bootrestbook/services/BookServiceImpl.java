package com.api.book.bootrestbook.services;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    //    List<Book> list;

//    public BookServiceImpl(){
//
//
//
////        list = new ArrayList<>();
////        list.add(new Book(1, "java" , "jack", "gauseline"));
////        list.add(new Book(2, "c++" , "sparrow", "bjarne"));
////        list.add(new Book(3, "python" , "nick", "stark"));
//    }

    @Override
    public List<Book> getAllBooks() {
         List<Book> list = this.bookRepository.findAll();
        return list;
    }


    //for single book by Id.
    @Override
    public Book getBook(int bookid) {
        Book book = null;
        try {
            book = this.bookRepository.findById(bookid);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        Book b = null;
//        for(Book book : list)
//        {
//            if(book.getBookId() == bookid)
//            {
//               b = book;
//               break;
//            }
//        }
        return book;
    }

    @Override
    public Book addBooks(Book book) {

       return this.bookRepository.save(book);

//       list.add(book);


    }

    @Override
    public Book updatebook(int bookId , Book book) {

        book.setBookId(bookId);// jo book get ki hai vahi update hogi.
        this.bookRepository.save(book);

//        for(Book b : list)
//        {
//            if(b.getBookId() == bookId)
//            {
//                b.setBookTitle(book.getBookTitle());
//                break;
//            }
//        }
        return book;
    }

    @Override
    public void deleteBook(int bookId) {

        this.bookRepository.deleteById(bookId);

//        for(Book b : list)
//        {
//            if(b.getBookId() == bookId)
//            {
//                list.remove(b);
//                break;
//            }
//        }
    }
}
