package br.com.context.junit5.param;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArgumentConverterTest {

  @ParameterizedTest
  @CsvSource({"2018/12/25,2018", "2019/02/11,2019"})
  void getYear_ShouldWorkAsExpected(@ConvertWith(SlashyDateConverter.class) LocalDate date, int expected) {
    assertEquals(expected, date.getYear());
  }


  class SlashyDateConverter implements ArgumentConverter {

    @Override
    public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {
      try {
        String[] parts = ((String) source).split("/");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        return LocalDate.of(year, month, day);
      } catch (Exception e) {
        throw new IllegalArgumentException("Failed to convert", e);
      }
    }
  }
}
