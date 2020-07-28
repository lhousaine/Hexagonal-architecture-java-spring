package com.ouarhou.hexagolarchitecture.application.controllers;

import java.util.Collection;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ouarhou.hexagolarchitecture.domain.models.Book;
import com.ouarhou.hexagolarchitecture.domain.service.BookService;

import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class ImplBookController implements IBookController{
    private final BookService bookService;

    @Override
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Book> findAllBooks() {
        return bookService.findAllBooks();
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{bookId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Book findBookById(@PathVariable("bookId") UUID bookId) {
        return bookService.findBookById(bookId);
    }

    @Override
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Book addNewBook(@RequestBody Book book) {
        return bookService.addNewBook(book);
    }

    @Override
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{bookId}")
    public void deleteBook(@PathVariable("bookId") UUID bookId) {
        bookService.deleteBook(bookId);
    }

    @Override
    @ResponseStatus(HttpStatus.ACCEPTED)
    @PatchMapping(value = "/{bookId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book updateBook(@PathVariable("bookId") UUID bookId,@RequestBody Book book) throws NotFoundException {
        return bookService.updateBook(bookId,book);
    }
}
