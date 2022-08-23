package org.example.controller;

import org.example.model.Book;
import org.example.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/save")
    public String saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping("/search/{bookId}")
    public Book getBook(@RequestParam int bookId) {
        return bookService.getBook(bookId);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public List<Book> deleteBook(@PathVariable int bookId) {
        return bookService.removeBook(bookId);
    }

}
