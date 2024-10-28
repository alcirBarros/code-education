package br.com.context.junit5.param;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import br.com.context.entity.EmuType;
import java.util.List;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ParameterTest {

    @ParameterizedTest
    @ValueSource(strings = {"TESTE", "TESTO"})
    public void invalidPhones(String value) {
        System.out.println(value);
    }

    @ParameterizedTest
    @EnumSource(names = { "DAY", "MONTH" })
    public void withEnumSource(EmuType value) {
        boolean result = List.of(EmuType.DAY, EmuType.MONTH).contains(value);
        assertTrue(result);
    }

    @ParameterizedTest
    @EnumSource(value = EmuType.class)
    public void enumValue(EmuType value) {
        boolean result = List.of(EmuType.DAY, EmuType.MONTH).contains(value);
        assertTrue(result);
    }

    @RepeatedTest(5)
    void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", delimiterString = ",", lineSeparator = "\n", numLinesToSkip = 1)
    void toUpperCase_ShouldGenerateTheExpectedUppercaseValueCSVFile(String colum01, String colum02, String colum03) {
        assertNotNull(colum01);
        assertNotNull(colum02);
        assertNotNull(colum03);
    }
}
