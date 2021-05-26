package com.example.test1;


import com.example.test1.model.Product;
import com.example.test1.repository.PersonMongoDBRepository;
import com.example.test1.repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class SpringBootMongoDBTest {
        @Autowired()
        private PersonMongoDBRepository personMongoDBRepository;

        @Test
        public void printProjectData() {
            System.out.println(personMongoDBRepository.findAll());
        }
    }
