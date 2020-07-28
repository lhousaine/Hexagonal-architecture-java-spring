package com.ouarhou.hexagolarchitecture.insfrastructure.configuration;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.ouarhou.hexagolarchitecture.insfrastructure.repository.mongo.SpringDataMongoBookRepository;

@EnableMongoRepositories(basePackageClasses = SpringDataMongoBookRepository.class)
public class MongoDBConfiguration {

}
