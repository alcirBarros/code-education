package br.com.context.util;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.apache.commons.collections4.ListUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ListUtilTest {

  @Test
  public void test001() {
    List<Integer> integerList = asList(1, 2, 3, 4, null, 6, 7, 8, 9, 10);
    Integer[] integerArray = ArrayUtil.toArray(integerList);
    List<Integer> result = ListUtil.isNotEmpty(integerArray);
    assertNotNull(result);
  }

  @Test
  public void test002() {
    List<String> stringList = asList("1", "2", "3", "4", "5", "6", "7", "", " ", null);
    List<String> result = ListUtil.isNotEmpty(stringList);
    assertNotNull(result);
  }

  @Test
  public void test003() {
    List<String> list01 = asList("1", "2", "3", "4", "5");
    List<String> list02 = asList("6", "7", "", " ", null);
    List<List<String>> stringList = asList(list01, list02);
    List<String> result = ListUtil.toList(stringList);
    assertNotNull(result);
  }

  @Test
  public void test004() {
    List<List<String>> stringList = asList(null, null);
    List<String> result = ListUtil.toList(stringList);
    assertNotNull(result);
  }

  @Test
  public void test005() {
    List<String> result = ListUtil.toList(null);
    assertNotNull(result);
  }

  @Test
  public void test006() {
    List<String> result = asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    List<List<String>> partition = ListUtil.partition(result, 5);
    assertNotNull(partition);
  }


}
