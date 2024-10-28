package br.com.context.service;

import br.com.context.entity.Person;
import br.com.context.repository.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

  @Autowired
  private PersonRepository personRepository;

  public List<Person> findAll(){
    return personRepository.findAll();
  }

  public void delete(Person person){
    personRepository.delete(person);
  }

  public void deleteAll(List<Person> personList){
    personRepository.deleteAll(personList);
  }

}
