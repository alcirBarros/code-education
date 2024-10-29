package br.com.context.repository.db.mysql.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public abstract class GenericRepository {

    @PersistenceContext
    protected EntityManager em;

    @Autowired
    protected JdbcTemplate jdbcTemplate;

}
