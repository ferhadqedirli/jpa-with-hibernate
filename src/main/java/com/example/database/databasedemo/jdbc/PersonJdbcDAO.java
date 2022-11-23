package com.example.database.databasedemo.jdbc;

import com.example.database.databasedemo.entity.Person;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDAO {

    private final JdbcTemplate jdbcTemplate;

    public PersonJdbcDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //select * from person
    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<>(Person.class));
    }

    //select p from person p
    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from person where id = ?",
                new BeanPropertyRowMapper<>(Person.class),
                id);
    }

    public List<Person> findAllByName(String name) {
        return jdbcTemplate.query("select * from person where name = ?",
                new BeanPropertyRowMapper<>(Person.class),
                name);
    }

    public List<Person> findAllByLocation(String location) {
        return jdbcTemplate.query("select * from person where location = ?",
                new BeanPropertyRowMapper<>(Person.class),
                location);
    }
}
