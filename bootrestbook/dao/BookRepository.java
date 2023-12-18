package com.api.book.bootrestbook.dao;


import com.api.book.bootrestbook.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findById(int id);
}
