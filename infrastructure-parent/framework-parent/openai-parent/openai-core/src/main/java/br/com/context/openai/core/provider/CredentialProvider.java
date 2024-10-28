package br.com.context.openai.core.provider;

import br.com.context.openai.core.auth.credential.Credential;

public interface CredentialProvider {

    Credential getCredential();

}
