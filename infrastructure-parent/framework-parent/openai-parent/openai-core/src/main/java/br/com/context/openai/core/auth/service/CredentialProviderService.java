package br.com.context.openai.core.auth.service;

import br.com.context.openai.core.provider.CredentialProvider;
import br.com.context.openai.property.OpenAiProperties;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class CredentialProviderService {

    protected final List<CredentialProvider> credentialProviderList;

    public CredentialProvider getCredentialProvider() {
        Stream<CredentialProvider> credentialProviderStream = credentialProviderList.stream();
        Stream<CredentialProvider> credentialIsNotEmptyStream = credentialProviderStream.filter(ObjectUtils::isNotEmpty);
        return credentialIsNotEmptyStream.findFirst().orElseThrow();
    }

}
