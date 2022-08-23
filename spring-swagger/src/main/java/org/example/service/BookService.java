package org.example.service;

import org.example.dao.BookRepository;
import org.example.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/")
    public String saveBook(Book book) {
        bookRepository.save(book);
        return "Book save with id: " + book.getId();
    }

    public Book getBook(int bookId) {
        return bookRepository.findById(bookId).get();
    }

    public List<Book> removeBook(int bookId) {
        bookRepository.deleteById(bookId);
        return bookRepository.findAll();
    }
}
