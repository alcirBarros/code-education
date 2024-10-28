package br.com.context.comparable;

import br.com.context.entity.Department;
import br.com.context.entity.Dependent;
import br.com.context.entity.Person;
import java.util.Collections;
import java.util.Comparator;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ComparableTest {


  @Test
  public void test001() {

    Person person = new Person();

    {
      Dependent dependent = new Dependent();
      dependent.setUuid(UUID.fromString("3348fe63-4e03-4a1f-93c6-f92fc3beff71"));
      dependent.setName("C");
      person.getDependentList().add(dependent);
    }

    {
      Dependent dependent = new Dependent();
      dependent.setUuid(UUID.fromString("a81ae82d-6386-4c70-87c4-bce5557962da"));
      dependent.setName("B");
      person.getDependentList().add(dependent);
    }

    {
      Dependent dependent = new Dependent();
      dependent.setUuid(UUID.fromString("32060604-d056-4744-b5ca-5f7a8c0c4575"));
      dependent.setName("A");
      person.getDependentList().add(dependent);
    }

    person.getDependentList().stream().map(Dependent::getName).forEach(System.out::println);

    Collections.sort(person.getDepartmentList(), Comparator.comparing(Department::getUuid));

  }
}
