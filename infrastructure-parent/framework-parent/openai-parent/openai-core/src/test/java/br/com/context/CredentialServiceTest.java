package br.com.context;

import br.com.context.openai.core.provider.CredentialProvider;
import br.com.context.openai.core.auth.service.CredentialProviderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CredentialServiceTest {

    @Autowired
    private CredentialProviderService credentialProviderService;

    @Test
    void mustRaiseAnException() {
        CredentialProvider credentialProvider = credentialProviderService.getCredentialProvider();
        assertNotNull(credentialProvider.getCredential());
    }

}
