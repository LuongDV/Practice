package org.example.dao;

import org.example.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BookRepository extends JpaRepository<Book, Serializable> {
}
