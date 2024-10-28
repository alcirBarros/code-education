package br.com.context.repository.base;

import br.com.context.model.BaseEntity;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BaseEntityRepositoryTest {

    @Autowired
    private BaseEntityRepository baseEntityRepository;

    private List<BaseEntity> baseEntityList = List.of(
            BaseEntity.builder().stringType("string").build(),
            BaseEntity.builder().build()
    );

    @BeforeEach
    public void beforeEach() {
        baseEntityRepository.deleteAll();
        baseEntityRepository.saveAll(baseEntityList);
        System.out.println("BeforeEach");
    }

}
