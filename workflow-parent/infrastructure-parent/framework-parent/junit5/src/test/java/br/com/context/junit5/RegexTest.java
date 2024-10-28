package br.com.context.junit5;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@SpringBootTest
public class RegexTest {

/*Meta-caracteres

 . Um caracter qualquer
 ^ O início de string
 $ O final da string
 ? Repetir zero ou uma vez
 * Repetir zero ou mais vezes
 + Repetir uma ou mais vezes
 \ Usado para indicar caracteres especiais.

 */

    List<String> names = Arrays.asList(
            "*/DFE101_20220105.TXT",
            "/sad/DFE101_20220104.TXT",
            "/sad/DFE101_20211210.TXT",
            "/sad/DFE101_20211209.TXT",

            "/v2/DFE101_20221210.TXT",
            "/v1/DFE101_2022121.TXT",

            "/sad/DFE101_20211209.tXt",
            "/sad/DDE101_20211208.TXT",
            "/sad/DFE101_20211209.txt"
    );

    @Test
    public void teste01() {
        List<String> collect = names.stream().max(Comparator.comparing(this::extractionTextRegex)).stream().collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void teste02() {
        String mydata = "some string with 'the data i want' inside";
        Pattern pattern = Pattern.compile("'(.*?)'");
        Matcher matcher = pattern.matcher(mydata);
        String group1 = matcher.find() ? matcher.group() : null;
        System.out.println(group1);
    }

    @Test
    public void teste03() {

        List<String> dfe101 = names.stream().filter(name -> Pattern.compile("DFE101\\_\\d{8}(.TXT|.txt|)").matcher(name).find()).map(x -> {
            return extractionTextRegex(x);
        }).collect(Collectors.toList());

        System.out.println(dfe101);
    }
    private String extractionTextRegex(String text) {
        Matcher matcher = matcherRegex("\\d{8}", text);
        return matcher.find() ? matcher.group() : null;
    }

    private Matcher matcherRegex(String regex, String text) {
        return Pattern.compile(regex).matcher(text);
    }


    @Test
    public void teste04() {
        String mydata = "S1234";
        Pattern pattern = Pattern.compile("\\d{4}");
        Matcher matcher = pattern.matcher(mydata);
        String group1 = matcher.find() ? matcher.group() : null;
        System.out.println(group1);
    }

    @Test
    public void test005() {
        Matcher matcher = Pattern.compile("\\d{4}").matcher("S1234");
        String s = Optional.of(matcher).filter(Matcher::find).map(Matcher::group).orElse(null);
        assertNotNull(s);
    }

    @Test
    public void test006() {
        Pattern compile = Pattern.compile("redis://(.*):(\\d+)");
        Matcher matcher = compile.matcher("redis://mdominio.dominio.services:6380");

        Optional.of(matcher).filter(Matcher::find).ifPresent(x -> {
            int i = x.groupCount();
            String group = x.group();
            String host = x.group(0);
            String domain = x.group(1);
            String port = x.group(2);
            assertNotNull(host);
            assertNotNull(port);
        });

    }
}
