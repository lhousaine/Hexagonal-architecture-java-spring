package com.ouarhou.hexagolarchitecture.insfrastructure.repository.mongo;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import javax.inject.Inject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.ouarhou.hexagolarchitecture.domain.models.Book;
import com.ouarhou.hexagolarchitecture.domain.repository.BookRepository;

@Component
@Primary
public class MongoDbBookRepository implements BookRepository {

    private final SpringDataMongoBookRepository bookRepository;

    @Inject
    public MongoDbBookRepository(SpringDataMongoBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Optional<Collection<Book>> findAll() {
        return Optional.of(bookRepository.findAll());
    }

    @Override
    public Optional<Book> findById(UUID bookId) {
        return bookRepository.findById(bookId);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(UUID bookId) {
         bookRepository.deleteById(bookId);
    }

}
