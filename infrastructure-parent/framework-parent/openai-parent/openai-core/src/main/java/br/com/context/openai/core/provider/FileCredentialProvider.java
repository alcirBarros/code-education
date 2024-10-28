package br.com.context.openai.core.provider;

import br.com.context.openai.core.auth.credential.BasicCredential;
import br.com.context.openai.core.auth.credential.Credential;
import br.com.context.openai.property.OpenAiProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

@Configuration
public class FileCredentialProvider implements CredentialProvider {

    @Autowired
    private OpenAiProperties openAiProperties;

    @Override
    public Credential getCredential() {
        StringBuilder path = new StringBuilder();
        path.append(openAiProperties.getHomePath());
        path.append(File.separator);
        path.append(".openai");
        path.append(File.separator);
        path.append("credential.yaml");
        String secretKey = readYamlFile(path.toString());
        return BasicCredential.builder().secretKey(secretKey).build();
    }

    public String readYamlFile(String filePath) {
        try {
            InputStream inputStream = new FileInputStream(filePath);
            Yaml yaml = new Yaml();
            Map<String, Object> data = yaml.load(inputStream);
            return (String) data.get("secret_key");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
