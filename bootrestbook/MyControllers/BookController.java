package com.api.book.bootrestbook.MyControllers;

import com.api.book.bootrestbook.entities.Book;
import com.api.book.bootrestbook.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    public BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){

        List<Book> list = bookService.getAllBooks();
//        return list;
        if(list.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(list) ;
    }
   @GetMapping("/books/{bookid}")
    public ResponseEntity<Book> getBookByid(@PathVariable("bookid") String bookid){

       Book book = this.bookService.getBook(Integer.parseInt(bookid));
       if(book == null)
       {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
       }
        return ResponseEntity.of(Optional.of(book));
   }

   @PostMapping("/books")
    public ResponseEntity<Book> addBooks(@RequestBody Book book){
       Book b = null;
            try {
                b = this.bookService.addBooks(book);
                return ResponseEntity.of(Optional.of(b));
            }catch (Exception e)
            {
                e.printStackTrace();
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
   }

   @PutMapping("/books/{bookId}")
    public ResponseEntity<Book> updateBook(@PathVariable String bookId , @RequestBody Book book) {
       try {
           this.bookService.updatebook(Integer.parseInt(bookId), book);
           return ResponseEntity.ok().body(book); //satatus or data dono sath send karna.
       } catch (Exception e) {
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
       }
   }

   @DeleteMapping("/books/{bookId}")
    public  ResponseEntity<Void> deleteBook(@PathVariable String  bookId) {
       try {
           this.bookService.deleteBook(Integer.parseInt(bookId));
          return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
       } catch (Exception e) {

          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
       }
   }
}
