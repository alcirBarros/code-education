package br.com.context;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import br.com.context.model.Person;
import br.com.context.model.User;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ModelMapperTest {

  @Autowired
  private ModelMapper modelMapper;

  @Test
  public void mustConvertUserToPerson() {
    User user = User.builder().id(123).userName("userName").build();
    Person map = modelMapper.map(user, Person.class);
    assertNotNull(map.getUserName());
  }
}
