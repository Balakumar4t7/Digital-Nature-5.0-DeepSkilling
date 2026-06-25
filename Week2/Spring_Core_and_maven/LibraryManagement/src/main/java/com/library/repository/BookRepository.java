package com.library.repository;

import java.awt.print.Book;

public class BookRepository  {
    BookRepository(){
        System.out.println("Bookrepository bean is created so The Constructor is Running");
    }

    public void callingRepo() {
        System.out.println("here the Repositroy is called ! ");
    }
}
