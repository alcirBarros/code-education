package br.com.context.openai.core.provider;

import br.com.context.openai.core.auth.credential.BasicCredential;
import br.com.context.openai.core.auth.credential.Credential;

//@Configuration
public class EnvironmentCredentialProvider implements CredentialProvider {

    public static final String OPENAI_SECRET_KEY = "OPENAI_SECRET_KEY";

    @Override
    public Credential getCredential() {
        String secretKey = System.getenv(OPENAI_SECRET_KEY);
        return BasicCredential.builder().secretKey(secretKey).build();
    }
}
