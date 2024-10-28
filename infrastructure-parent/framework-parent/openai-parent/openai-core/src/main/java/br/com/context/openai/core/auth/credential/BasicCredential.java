package br.com.context.openai.core.auth.credential;

import lombok.Builder;

@Builder
public class BasicCredential implements Credential{

    private final String secretKey;

    @Override
    public String getSecretKey() {
        return secretKey;
    }
}
