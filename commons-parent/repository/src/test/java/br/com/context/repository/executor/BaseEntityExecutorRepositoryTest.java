package br.com.context.repository.executor;

import br.com.context.model.BaseEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;
import java.util.UUID;

import static br.com.context.repository.executor.BaseEntityExecutorRepository.find;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BaseEntityExecutorRepositoryTest {

    @Autowired
    private BaseEntityExecutorRepository baseEntityExecutorRepository;

    @Test
    @Sql(statements = {
            "insert into base_entity (uuid_type, string_type) values ('84cf23d5-cd15-40e1-905a-4e07ad7f240f', 'texto')"
    })
    public void findAll() {
        UUID uuid = UUID.fromString("84cf23d5-cd15-40e1-905a-4e07ad7f240f");
        Specification<BaseEntity> baseEntitySpecification = find("texto", null);
        List<BaseEntity> baseEntityList = baseEntityExecutorRepository.findAll(baseEntitySpecification);
        assertNotNull(baseEntityList, "Deve ser verdadeiro");
    }

}
