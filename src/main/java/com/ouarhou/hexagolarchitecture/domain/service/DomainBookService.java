package com.ouarhou.hexagolarchitecture.domain.service;

import java.util.Collection;
import java.util.UUID;

import com.ouarhou.hexagolarchitecture.domain.models.Book;
import com.ouarhou.hexagolarchitecture.domain.repository.BookRepository;

import javassist.NotFoundException;

public class DomainBookService implements BookService {
    private final BookRepository bookRepository;

    public DomainBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Collection<Book> findAllBooks() {
        return bookRepository
            .findAll()
            .orElseThrow(() -> new RuntimeException("There is no Book"));
    }

    @Override
    public Book findBookById(UUID bookId) {
        return bookRepository
            .findById(bookId)
            .orElseThrow(() -> new RuntimeException("Order with given id doesn't exist"));
    }

    @Override
    public Book addNewBook(Book book) {
        book.setId(UUID.randomUUID());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(UUID bookId) {
         bookRepository.delete(bookId);
    }

    @Override
    public Book updateBook(UUID bookId, Book book) throws NotFoundException {
        if (!bookRepository.findById(bookId).isPresent()) {
            throw new NotFoundException("No book was identified by " + bookId);
        }
        book.setId(bookId);
        return bookRepository.save(book);
    }
}
