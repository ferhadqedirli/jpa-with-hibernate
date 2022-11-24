package com.example.database.databasedemo;

import com.example.database.databasedemo.entity.Person;
import com.example.database.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    private final PersonJpaRepository repository;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public JpaDemoApplication(PersonJpaRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Inserting Person -> {} ", repository.insert(new Person("Tony", "Berlin", new Date())));
        logger.info("Updating Person -> {} ", repository.update(new Person(1,"Tony", "Tokyo", new Date())));
        logger.info("Person info -> {} ", repository.findById(1));
    }
}
