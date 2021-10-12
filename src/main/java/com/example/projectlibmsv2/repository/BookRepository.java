package com.example.projectlibmsv2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectlibmsv2.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
  List<Book> findByPublished(boolean published);
  List<Book> findByIsbnContaining(String isbn);
}
