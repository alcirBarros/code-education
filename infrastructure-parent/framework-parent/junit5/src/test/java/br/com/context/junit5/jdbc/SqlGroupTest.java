package br.com.context.junit5.jdbc;


import org.junit.jupiter.api.Test;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.jdbc.SqlGroup;

@SqlGroup({
    @Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, scripts = {
        "classpath:data/hsql/init-roles.sql",
        "classpath:data/hsql/init-users.sql"
    }),
    @Sql(executionPhase = ExecutionPhase.AFTER_TEST_METHOD, scripts = "classpath:data/hsql/clear.sql")
})
public class SqlGroupTest {

  @Test
  public void findByNameTest() {
//    User user = getUsers(1, 1001).get(0);
//    User fetchedUser = userRepository.findByName(user.getName());
//    assertNotNull("User shouldn't be NULL", fetchedUser);
  }

}
