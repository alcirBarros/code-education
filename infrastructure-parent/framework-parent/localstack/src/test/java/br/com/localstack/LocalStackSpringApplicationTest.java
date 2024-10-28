package br.com.localstack;

import br.com.localstack.config.LocalStackContainerTest;
import br.com.localstack.config.LocalStackContainerTest.AmazonStorageS3ConfigTest;
import com.amazonaws.services.s3.AmazonS3;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.Assert.assertNotNull;

@Testcontainers
@SpringBootTest
@Import(AmazonStorageS3ConfigTest.class)
public class LocalStackSpringApplicationTest extends LocalStackContainerTest {

    @Autowired
    private AmazonS3 amazonS3;

    @Test
    public void init() {
        assertNotNull(amazonS3);
    }
}
