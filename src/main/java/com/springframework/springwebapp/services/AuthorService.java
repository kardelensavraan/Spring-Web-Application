package com.springframework.springwebapp.services;

import com.springframework.springwebapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
