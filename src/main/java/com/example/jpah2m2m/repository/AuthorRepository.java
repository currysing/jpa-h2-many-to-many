package com.example.jpah2m2m.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpah2m2m.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    Author findByName(String name);

    List<Author> findByNameContaining(String name);

}