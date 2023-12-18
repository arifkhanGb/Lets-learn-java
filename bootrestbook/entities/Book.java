package com.api.book.bootrestbook.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "record")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    private String bookName;

    @OneToOne(cascade = CascadeType.ALL)
    private Author bookAuthor;
    private String bookTitle;


    public Book() {
        super();

    }

//    public Book(int bookId, String bookName, String bookTitle, String bookAuthor) {
//        this.bookId = bookId;
//        this.bookName = bookName;
//        this.bookTitle = bookTitle;
//        this.bookAuthor = bookAuthor;
//    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(Author bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }

}
