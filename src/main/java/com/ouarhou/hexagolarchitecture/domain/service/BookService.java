package com.ouarhou.hexagolarchitecture.domain.service;

import java.util.Collection;
import java.util.UUID;

import com.ouarhou.hexagolarchitecture.domain.models.Book;

import javassist.NotFoundException;

public interface BookService {
    public Collection<Book> findAllBooks();
    public Book findBookById(UUID bookId);
    public Book addNewBook(Book book);
    public void deleteBook(UUID bookId);
    public Book updateBook(UUID bookId, Book book) throws NotFoundException;
}
