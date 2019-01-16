package com.example.jpah2m2m.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpah2m2m.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByName(String name);

    List<Book> findByNameContaining(String name);

}
