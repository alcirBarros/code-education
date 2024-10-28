package br.com.context.repository.person;

import br.com.context.model.PersonExampleQueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PersonExampleQueryEntityLikeQueryRepository extends JpaRepository<PersonExampleQueryEntity, UUID> {

    List<PersonExampleQueryEntity> findAllByNameStartingWith(String name);

    List<PersonExampleQueryEntity> findAllByNameEndingWith(String name);

    List<PersonExampleQueryEntity> findAllByNameIgnoreCase(String name);

    List<PersonExampleQueryEntity> findAllByNameStartingWithIgnoreCase(String name);

    List<PersonExampleQueryEntity> findAllByNameEndingWithIgnoreCase(String name);

    List<PersonExampleQueryEntity> findAllByNameContaining(String name);

    List<PersonExampleQueryEntity> findAllByNameContainingIgnoreCase(String name);

    List<PersonExampleQueryEntity> findAllByNameStartingWithOrSocialNameStartingWith(String name, String socialName);

}
