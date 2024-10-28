//package br.com.context.repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.RequiredArgsConstructor;
//import lombok.Setter;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Component;
//
//@SpringBootTest
//@RequiredArgsConstructor
//class JdbcTemplateTest {
//
//  @Autowired
//  private PersonRepository personRepository;
//
//
//
//  @Test
//  void contextLoads() {
//    List<Person> personList = personRepository.findAll();
//    System.out.println("AAAAAAA");
//  }
//
//  @Test
//  void count() {
//    Long count = personRepository.count();
//    System.out.println(count);
//  }
//
//}
//
//class PersonMapper implements RowMapper<Person> {
//
//  public Person mapRow(ResultSet resultSet, int i) throws SQLException {
//    Person person = new Person();
//    person.setId(resultSet.getLong("id"));
//    person.setFirstName(resultSet.getString("first_name"));
//    person.setLastName(resultSet.getString("last_name"));
//    return person;
//  }
//
//}
//
//
//@Getter
//@Setter
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//class Person {
//  private Long id;
//  private String firstName;
//  private String lastName;
//}
//
//@Component
//class PersonRepository {
//
//  @Autowired
//  private JdbcTemplate jdbcTemplate;
//
//  public List<Person> findAll() {
//    return jdbcTemplate.query("select * from person", new PersonMapper());
//  }
//
//  public Long count() {
//    return jdbcTemplate.queryForObject("select count(id) from person", Long.class);
//  }
//}
