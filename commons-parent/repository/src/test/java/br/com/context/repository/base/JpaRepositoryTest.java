package br.com.context.repository.base;

import br.com.context.model.BaseEntity;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JpaRepositoryTest {

  @Autowired
  private JpaRepository<BaseEntity, UUID> jpaRepository;


  private List<BaseEntity> baseEntityList = List.of(
      BaseEntity.builder().stringType("string").build(),
      BaseEntity.builder().build()
                                                   );

  @BeforeAll
  public void BeforeAll() {
    jpaRepository.deleteAll();
    jpaRepository.saveAll(baseEntityList);
    System.out.println("BeforeEach");
  }

  @Test
  public void findAll() {
    List<BaseEntity> baseEntityList = jpaRepository.findAll();
    assertNotNull(baseEntityList, "Deve ser verdadeiro");
  }

  @Test
  public void findAllById() {
    Iterable<UUID> uuid = List.of(UUID.randomUUID());
    List<BaseEntity> baseEntityList = jpaRepository.findAllById(uuid);
    assertNotNull(baseEntityList, "Deve ser verdadeiro");
  }

  @Test
  public void saveAll() {
    List<BaseEntity> baseEntityList = List.of(new BaseEntity());
    List<BaseEntity> baseEntityList1 = jpaRepository.saveAll(baseEntityList);
    assertNotNull(baseEntityList1, "Deve ser verdadeiro");
  }

  @Test
  public void saveAndFlush() {
    BaseEntity baseEntityList = new BaseEntity();
    BaseEntity baseEntity = jpaRepository.saveAndFlush(baseEntityList);
    assertNotNull(baseEntity, "Deve ser verdadeiro");
  }

  @Test
  public void saveAllAndFlush() {
    List<BaseEntity> baseEntityList = List.of(new BaseEntity());
    List<BaseEntity> baseEntityList1 = jpaRepository.saveAllAndFlush(baseEntityList);
    assertNotNull(baseEntityList1, "Deve ser verdadeiro");
  }

  @Test
  public void findAllPageable() {
    Pageable pageable = Pageable.ofSize(10);
    Page<BaseEntity> baseEntityPage = jpaRepository.findAll(pageable);
    assertNotNull(baseEntityPage, "Deve ser verdadeiro");
  }

}