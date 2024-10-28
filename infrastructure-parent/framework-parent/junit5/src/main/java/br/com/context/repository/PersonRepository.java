package br.com.context.repository;

import br.com.context.entity.Person;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {

  public List<Person> findAll(){
    return List.of(Person.builder().build());
  }


  public void delete(Person person){

  }

  public void deleteAll(List<Person> personList){

  }

}
