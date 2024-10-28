package br.com.context.repository.base;

import br.com.context.model.BaseEntity;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.CrudRepository;

@SpringBootTest
public class CrudRepositoryTest {

  @Autowired
  private CrudRepository<BaseEntity, UUID> crudRepository;

//  @Test
//  public void test() {
//
//  }

}
