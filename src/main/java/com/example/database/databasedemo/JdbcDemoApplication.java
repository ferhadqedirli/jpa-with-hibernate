//package com.example.database.databasedemo;
//
//import com.example.database.databasedemo.entity.Person;
//import com.example.database.databasedemo.jdbc.PersonJdbcDAO;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.Date;
//
//@SpringBootApplication
//public class JdbcDemoApplication implements CommandLineRunner {
//
//    private final PersonJdbcDAO dao;
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    public JdbcDemoApplication(PersonJdbcDAO personJdbcDAO) {
//        this.dao = personJdbcDAO;
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(JdbcDemoApplication.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        logger.info("All persons -> {} ", dao.findAll());
//        logger.info("Person id 10001 -> {} ", dao.findById(10001));
//        logger.info("Person name Eltac -> {} ", dao.findAllByName("Eltac"));
//        logger.info("Person location Goyce -> {} ", dao.findAllByLocation("Goyce"));
//        logger.info("Deleting 10002 -> No of Rows Deleted {} ", dao.deleteById(10002));
//        logger.info("Inserting 10004 -> {} ", dao.
//                insert(new Person(10004, "Lara", "New York", new Date())));
//        logger.info("Updating 10003 -> {} ", dao.
//                update(new Person(10003, "Togrul", "Baku", new Date())));
//    }
//}
