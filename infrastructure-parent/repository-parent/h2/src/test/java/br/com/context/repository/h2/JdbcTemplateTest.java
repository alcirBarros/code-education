package br.com.context.repository.h2;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;

@SpringBootTest
public class JdbcTemplateTest {

    private static final Logger log = LoggerFactory.getLogger(JdbcTemplateTest.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test()
    @SqlGroup({
            @Sql(scripts = {"classpath:script.sql"}, executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    })
    public void test01() {
        jdbcTemplate.query("SELECT first_name, last_name FROM people",
                (rs, row) -> new Person(
                        rs.getString(1),
                        rs.getString(2))
        ).forEach(person ->
                log.info("Found <" + person + "> in the database.")
        );
    }

    class Person {
        private String lastName;
        private String firstName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "firstName: " + firstName + ", lastName: " + lastName;
        }
    }
}
