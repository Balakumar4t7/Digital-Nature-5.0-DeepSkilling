package com.DeepSkilling.LibraryManagement.controller;


import com.DeepSkilling.LibraryManagement.model.Book;
import com.DeepSkilling.LibraryManagement.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    BookService bookService;
    BookController (BookService bookService){
        this.bookService=bookService;
    }

    @PostMapping
    public ResponseEntity<Void> addBook(@RequestBody Book book){
        bookService.addNewBook(book);
        return ResponseEntity.status(200).build();
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){

        return ResponseEntity.status(200).body(bookService.getAllBooks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){
        return  ResponseEntity.status(200).body(bookService.getBookById(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book book){
        Book updated = bookService.updateBook(id,book);
        return ResponseEntity.ok(updated);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id){
        bookService.deleteBook(id);
        return ResponseEntity.status(200).build();
    }
}
