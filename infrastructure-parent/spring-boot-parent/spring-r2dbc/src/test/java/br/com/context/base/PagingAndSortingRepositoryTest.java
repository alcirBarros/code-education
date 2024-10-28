package br.com.context.base;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import br.com.context.entity.ESocialEventJpaEntity;
import br.com.context.model.ESocialEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PagingAndSortingRepositoryInterfaceTest extends PagingAndSortingRepository<ESocialEventJpaEntity, Long>{

}

@SpringBootTest
public class PagingAndSortingRepositoryTest {

  @Autowired(required = false)
  private PagingAndSortingRepositoryInterfaceTest pagingAndSortingRepository;

  @Test
  public void findAll_Sort() {
    Sort name = Sort.by("id");
    Iterable<ESocialEventJpaEntity> eSocialEventEntityIterable = pagingAndSortingRepository.findAll(name);

    eSocialEventEntityIterable.forEach(x -> {
      ESocialEvent y = (ESocialEvent)x;
      out.println(y.getId());
    });

    assertNotNull(eSocialEventEntityIterable);
  }

  @Test
  public void findAll_Pageable() {
    Pageable pageable = PageRequest.of(0, 5);
    Page<ESocialEventJpaEntity> eSocialEventEntityPage = pagingAndSortingRepository.findAll(pageable);

    ESocialEventJpaEntity eSocialEventJpaEntity = eSocialEventEntityPage.getContent().get(0);
    ESocialEvent y = (ESocialEvent)eSocialEventJpaEntity;

    assertNotNull(eSocialEventEntityPage);
  }
}
