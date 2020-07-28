package com.ouarhou.hexagolarchitecture.application.controllers;

import java.util.Collection;
import java.util.UUID;

import com.ouarhou.hexagolarchitecture.domain.models.Book;

import javassist.NotFoundException;

public interface IBookController {
    public Collection<Book> findAllBooks();
    public Book findBookById(UUID bookId);
    public Book addNewBook(Book book);
    public void deleteBook(UUID bookId);
    public Book updateBook(UUID bookId, Book book) throws NotFoundException;
}
