package br.com.context.repository.person;

import br.com.context.model.PersonExampleQueryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonExampleQueryEntityWithPaginationRepository extends JpaRepository<PersonExampleQueryEntity, UUID> {

    Page<PersonExampleQueryEntity> findAll(Pageable pageable);

    Page<PersonExampleQueryEntity> findByName(String name, Pageable pageable);

}