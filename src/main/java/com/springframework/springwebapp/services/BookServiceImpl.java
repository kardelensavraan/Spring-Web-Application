package com.springframework.springwebapp.services;

import com.springframework.springwebapp.domain.Book;
import com.springframework.springwebapp.repositories.BookRepository;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
