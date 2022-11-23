package com.example.database.databasedemo;

import com.example.database.databasedemo.jdbc.PersonJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

    private final PersonJdbcDAO dao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public DatabaseDemoApplication(PersonJdbcDAO personJdbcDAO) {
        this.dao = personJdbcDAO;
    }

    public static void main(String[] args) {
        SpringApplication.run(DatabaseDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All persons -> {} ", dao.findAll());
        logger.info("Person id 10001 -> {} ", dao.findById(10001));
        logger.info("Person name Eltac -> {} ", dao.findAllByName("Eltac"));
        logger.info("Person location Goyce -> {} ", dao.findAllByLocation("Goyce"));
    }
}
