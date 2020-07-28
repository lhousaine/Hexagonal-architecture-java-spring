package com.ouarhou.hexagolarchitecture.insfrastructure.repository.mongo;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ouarhou.hexagolarchitecture.domain.models.Book;

@Repository
public interface SpringDataMongoBookRepository extends MongoRepository<Book, UUID> {

}
