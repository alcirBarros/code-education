package br.com.context.repository.person;

import br.com.context.model.PersonExampleQueryEntity;
import java.util.List;
import java.util.UUID;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonExampleQueryEntityDeleteRepository extends JpaRepository<PersonExampleQueryEntity, UUID> {



}
