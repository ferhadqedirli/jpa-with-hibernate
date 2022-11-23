//package com.example.database.databasedemo.jdbc;
//
//import com.example.database.databasedemo.entity.Person;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Timestamp;
//import java.util.List;
//
//@Repository
//public class PersonJdbcDAO {
//
//    private final JdbcTemplate jdbcTemplate;
//
//    public PersonJdbcDAO(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    static class PersonRowMapper implements RowMapper<Person> {
//        @Override
//        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
//            Person person = new Person();
//            person.setId(rs.getInt("id"));
//            person.setName(rs.getString("name"));
//            person.setLocation(rs.getString("location"));
//            person.setBirthDate(rs.getTimestamp("birth_date"));
//            return person;
//        }
//    }
//
//    //select * from person
//    public List<Person> findAll() {
//        return jdbcTemplate.query("select * from person", new PersonRowMapper());
//    }
//
//    //select p from person p
//    public Person findById(int id) {
//        return jdbcTemplate.queryForObject("select * from person where id = ?",
//                new PersonRowMapper(),
//                id);
//    }
//
//    public List<Person> findAllByName(String name) {
//        return jdbcTemplate.query("select * from person where name = ?",
//                new PersonRowMapper(),
//                name);
//    }
//
//    public List<Person> findAllByLocation(String location) {
//        return jdbcTemplate.query("select * from person where location = ?",
//                new PersonRowMapper(),
//                location);
//    }
//
//    public int deleteById(int id) {
//        return jdbcTemplate.update("delete from person where id = ?", id);
//    }
//
//    public int insert(Person person) {
//        return jdbcTemplate.update("insert into person values(?, ?, ?, ?)",
//                person.getId(),
//                person.getName(),
//                person.getLocation(),
//                new Timestamp(person.getBirthDate().getTime()));
//    }
//
//    public int update(Person person) {
//        return jdbcTemplate.update("update person set name = ?, location = ?, birth_date = ? where id = ?",
//                person.getName(),
//                person.getLocation(),
//                new Timestamp(person.getBirthDate().getTime()),
//                person.getId());
//    }
//}
