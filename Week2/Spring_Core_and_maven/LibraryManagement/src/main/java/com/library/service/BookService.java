package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
        System.out.println("Bean for BookService is Created By Setter Inject Method so  BookService is Runing");
    }

    public  void callingBookRepo(){
        bookRepository.callingRepo();
    }
}
