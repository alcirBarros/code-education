

package br.com.context.util;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.entry;

public class HashMapUtil {

//  private void test(){
//    val valuesMap: HashMap<String, String> = HashMap<String, String>()
//		valuesMap.put("1", "A");
//		valuesMap.put("2", "B");
//		val get = valuesMap.get("1")
//  }

    private void java8() {


        Map<String, String> myMap = new HashMap<String, String>() {{
            put("a", "b");
            put("c", "d");
        }};
    }

    private void java9() {

        Map<String, String> test1 = Map.of(
                "a", "b",
                "c", "d"
        );

        Map<String, String> test2 = Map.ofEntries(
                entry("a", "b"),
                entry("c", "d")
        );
    }

    private void java17() {
        Map<String, String> stringStringMap = Collections.singletonMap("key", "value");
    }


}
