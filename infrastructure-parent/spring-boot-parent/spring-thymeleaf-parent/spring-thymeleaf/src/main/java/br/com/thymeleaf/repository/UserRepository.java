package br.com.thymeleaf.repository;

import br.com.thymeleaf.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.math.BigInteger;
import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private EntityManager entityManager;

    public Long count() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT ");
        query.append("  count(user0_.id) AS col_0_0_ ");
        query.append("FROM ");
        query.append("  USER user0_ ");
        BigInteger count = (BigInteger) entityManager.createNativeQuery(query.toString()).getSingleResult();
        return count.longValue();
    }

    public Page<User> findAll(Pageable pageable) {
        int pageSize = pageable.getPageSize();
        int pageNumber = pageable.getPageNumber();
        long count = this.count();
        StringBuilder query = new StringBuilder();
        query.append("SELECT ");
        query.append("    user0_.id AS id1_0_, ");
        query.append("    user0_.first_name AS first_na2_0_, ");
        query.append("    user0_.last_name AS last_nam3_0_, ");
        query.append("    user0_.username AS username4_0_ ");
        query.append("FROM ");
        query.append("    USER user0_ ");
        query.append("LIMIT :pageSize offset :page ");
        Query nativeQuery = entityManager.createNativeQuery(query.toString(), User.class);
        nativeQuery.setParameter("pageSize", pageSize);
        nativeQuery.setParameter("page", (pageNumber * pageSize));
        List<User> userList = nativeQuery.getResultList();
        Page<User> bookPage = new PageImpl<>(userList, pageable, count);
        return bookPage;
    }
}
