package com.ouarhou.hexagolarchitecture.insfrastructure.repository.mysql;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ouarhou.hexagolarchitecture.domain.models.Book;

@Repository
public interface SpringDataMysqlBookRepository extends JpaRepository<Book, UUID> {

}
