package br.com.context.repository.person;

import br.com.context.model.PersonExampleQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PersonExampleQueryEntityBooleanQueryRepository extends JpaRepository<PersonExampleQueryEntity, UUID> {


    List<PersonExampleQueryEntity> findByActiveTrue();

    List<PersonExampleQueryEntity> findByActiveFalse();

    List<PersonExampleQueryEntity> findByActive(boolean active);

}
