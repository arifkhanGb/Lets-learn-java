package com.question3.Question3.repository;

import com.question3.Question3.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
    public Book findById(int id);
}
