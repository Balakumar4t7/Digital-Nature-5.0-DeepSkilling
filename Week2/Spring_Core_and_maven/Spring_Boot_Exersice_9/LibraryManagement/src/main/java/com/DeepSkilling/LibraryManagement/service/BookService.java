package com.DeepSkilling.LibraryManagement.service;

import com.DeepSkilling.LibraryManagement.model.Book;
import com.DeepSkilling.LibraryManagement.repository.BookRepository;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {



    BookRepository bookRepository ;

    BookService(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public void addNewBook(Book book) {
        bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return  bookRepository.findAll();
    }

    public Book updateBook(int id, Book book) {
        Book existBook = bookRepository.findById(id).orElseThrow( () -> new RuntimeException("Book Not found"));
        existBook.setBookName(book.getBookName());
        existBook.setAuthorName(book.getAuthorName());
        existBook.setGenre(book.getGenre());
        return bookRepository.save(existBook);
    }

    public void deleteBook(int id) {
         bookRepository.findById(id).orElseThrow(()->new RuntimeException("Book not found "));
         bookRepository.deleteById(id);
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book Not Found"));
    }
}
