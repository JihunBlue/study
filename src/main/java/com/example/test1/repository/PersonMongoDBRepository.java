package com.example.test1.repository;

import com.example.test1.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PersonMongoDBRepository extends MongoRepository<Person, String>{

}
