package br.com.context.util;


import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EnumUtilTest {

  @Test
  public void test001() {
    TypeEnum typeEnum = TypeEnum.valueOf(1000);
    System.out.println(typeEnum);
  }


  enum TypeEnum {
    S1000,
    S1005;

    public Integer getEventCode() {
      Pattern pattern = Pattern.compile("\\d{4}");
      Matcher matcher = pattern.matcher(this.name());
      return matcher.find() ? Integer.valueOf(matcher.group()) : null;
    }

    public static TypeEnum valueOf(Integer eventCode) {
      TypeEnum[] values = TypeEnum.values();
      return Arrays.stream(values).filter(x -> eventCode.equals(x.getEventCode())).findFirst().orElseThrow();
    }

  }
}
