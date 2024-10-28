package br.com.context.repository.base;

import br.com.context.model.BaseEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PagingAndSortingRepositoryTest {

    @Autowired
    private BaseEntityRepository baseEntityRepository;

    @Test
    public void findAllSort() {
        Sort sort = Sort.by(Sort.Order.asc("stringType"));
        List<BaseEntity> baseEntityIterable = baseEntityRepository.findAll(sort);
        assertNotNull(baseEntityIterable);
    }

    @Test
    public void findAllPageable() {
        Pageable pageable = Pageable.ofSize(10);
        Page<BaseEntity> baseEntityPage = baseEntityRepository.findAll(pageable);
        assertNotNull(baseEntityPage);
    }
}
