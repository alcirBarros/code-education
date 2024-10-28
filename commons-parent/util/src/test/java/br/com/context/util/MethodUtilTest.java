package br.com.context.util;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.lang.reflect.Method;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.junit.jupiter.api.Test;

public class MethodUtilTest {

//  @Test
//  public void givenMethodUtilsClass_whenCalledgetAccessibleMethod_thenCorrect() {
//
//    User user = new User(1, "user");
//    Method getUsername = MethodUtils.getAccessibleMethod(user.getClass(), "getUsername");
//    assertThat(getUsername).isInstanceOf(Method.class);
//  }

  class User {

    @Override
    public String toString() {
      return id + " - " + username;
    }

    int id;
    String username;

    public User() {
    }

    public User(int id, String username) {
      this.id = id;
      this.username = username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getUsername() {
      return username;
    }

    public int getId() {
      return id;
    }
  }
}
