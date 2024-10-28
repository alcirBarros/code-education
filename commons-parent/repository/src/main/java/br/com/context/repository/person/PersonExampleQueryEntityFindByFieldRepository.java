package br.com.context.repository.person;

import br.com.context.model.PersonExampleQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PersonExampleQueryEntityFindByFieldRepository extends JpaRepository<PersonExampleQueryEntity, UUID> {

    Optional<PersonExampleQueryEntity> findByName(String string);

    Optional<PersonExampleQueryEntity> findByNameNot(String string);

    Optional<PersonExampleQueryEntity> findByNameIsNot(String string);

}
