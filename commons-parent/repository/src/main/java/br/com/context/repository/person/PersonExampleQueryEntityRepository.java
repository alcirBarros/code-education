package br.com.context.repository.person;

import br.com.context.model.PersonExampleQueryEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PersonExampleQueryEntityRepository extends JpaRepository<PersonExampleQueryEntity, UUID> {

    List<PersonExampleQueryEntity> findAllFirstByName(String string);

    Optional<PersonExampleQueryEntity> findDistinctFirstByName(String string);

    List<PersonExampleQueryEntity> findAllLastByName(String string);

    Optional<PersonExampleQueryEntity> findDistinctLastByName(String string);

    List<PersonExampleQueryEntity> findAllFirstByNameOrderByNameAsc(String string);

    List<PersonExampleQueryEntity> findAllFirstByNameOrderByNameDesc(String string);




//    List<BaseEntity> findByEmailAddressAndLastName(EmailAddress emailAddress, String lastname);
//    List<BaseEntity> findDistinctBaseEntityByLastNameOrFirstName(String lastname, String firstname);
//    List<BaseEntity> findBaseEntityDistinctByLastNameOrFirstName(String lastname, String firstname);
//    List<BaseEntity> findByLastNameAndFirstNameAllIgnoreCase(String lastname, String firstname);
//    List<BaseEntity> findByLastNameOrderByFirstNameAsc(String lastname);
//    List<BaseEntity> findByLastNameOrderByFirstNameDesc(String lastname);

}
