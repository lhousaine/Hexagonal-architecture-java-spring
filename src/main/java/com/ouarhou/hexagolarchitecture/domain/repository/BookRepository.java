package com.ouarhou.hexagolarchitecture.domain.repository;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import com.ouarhou.hexagolarchitecture.domain.models.Book;

public interface BookRepository {
    public Optional<Collection<Book>> findAll();
    public Optional<Book> findById(UUID bookId);
    public Book save(Book book);
    public void delete(UUID bookId);
}
