package br.com.context.repository.person;

import br.com.context.model.PersonExampleQueryEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface PersonExampleQueryEntityWithSortingRepository extends JpaRepository<PersonExampleQueryEntity, UUID> {

  List<PersonExampleQueryEntity> findAllFirstByNameOrderByNameDesc(String string, Sort sort);

}
