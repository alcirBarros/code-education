package br.com.context;

import br.com.context.model.Privilege;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@SpringBootTest
@TestConfiguration
public class BatchSpringApplicationTest {

    @Value("classpath:file.csv")
    private Resource fileCsv;

    @Test
    public void init() throws IOException {
        File file = fileCsv.getFile();
        List<Privilege> privileges = loadObjectList(Privilege.class, file);
        System.out.println(privileges);
    }

    public static <T> List<T> loadObjectList(Class<T> type, File file) {
        try {
            return new CsvMapper()
                    .enable(CsvParser.Feature.TRIM_SPACES)
                    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                    .readerFor(type)
                    .with(CsvSchema.emptySchema().withHeader())
                    .<T>readValues(file)
                    .readAll();
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
