package com.ouarhou.hexagolarchitecture.insfrastructure.configuration;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ouarhou.hexagolarchitecture.HexagolArchitectureApplication;
import com.ouarhou.hexagolarchitecture.domain.repository.BookRepository;
import com.ouarhou.hexagolarchitecture.domain.service.BookService;
import com.ouarhou.hexagolarchitecture.domain.service.DomainBookService;

@Configuration
@ComponentScan(basePackageClasses = HexagolArchitectureApplication.class)
public class BeanConfiguration {
    private final BookRepository bookRepository;

    @Inject
    public BeanConfiguration(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Bean
    public BookService createBookService() {
        return new DomainBookService(bookRepository);
    }

}
