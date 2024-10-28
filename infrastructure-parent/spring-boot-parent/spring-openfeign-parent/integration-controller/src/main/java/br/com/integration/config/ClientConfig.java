package br.com.integration.config;

import feign.Client;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;

import javax.net.ssl.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;

@Configuration
@Profile({"hml","prd"})
public class ClientConfig {

    @Value("classpath:ssl/alelo.p12")
    private Resource aleloP12;

    @Value("classpath:ssl/server.jks")
    private Resource serverJKS;

    @Bean
    public Client feignClient(SSLSocketFactory sslSocketFactory) {
        return new Client.Default(sslSocketFactory, null);
    }

    @Bean
    public SSLSocketFactory sslSocketFactory() {
        try {

            CertificateP12 certificateP12 = certificateP12();
            CertificateJKS certificateJKS = certificateJKS();

            Base64 base64 = new Base64();
            KeyStore clientStore = KeyStore.getInstance("PKCS12");
            InputStream keyStoreInputStream = new ByteArrayInputStream(base64.decode(certificateP12.keyStoreFile));
            clientStore.load(keyStoreInputStream, certificateP12.password.toCharArray());

            KeyStore trustStore = KeyStore.getInstance("JKS");
            InputStream trustStoreInputStream = new ByteArrayInputStream(base64.decode(certificateJKS.keyStoreFile));
            trustStore.load(trustStoreInputStream, certificateJKS.password.toCharArray());

            KeyManager[] keyManager = keyManager(clientStore, certificateP12.password);
            TrustManager[] trustManager = trustManager(trustStore);

            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(keyManager, trustManager, new java.security.SecureRandom());

            return sslContext.getSocketFactory();
        } catch (Exception e) {
            throw new NullPointerException();
        }
    }

    private CertificateP12 certificateP12() throws Exception {
        File file = aleloP12.getFile();
        InputStream is = new FileInputStream(file);
        byte[] bytes = is.readAllBytes();
        String s = new Base64().encodeToString(bytes);
        CertificateP12 certificateP12 = new CertificateP12();
        certificateP12.keyStoreFile = s;
        certificateP12.password = "@lelo@123";
        return certificateP12;
    }

    private CertificateJKS certificateJKS() throws Exception {

        File file = serverJKS.getFile();
        InputStream is = new FileInputStream(file);
        byte[] bytes = is.readAllBytes();
        String s = new Base64().encodeToString(bytes);

        CertificateJKS certificateJKS = new CertificateJKS();
        certificateJKS.keyStoreFile = s;
        certificateJKS.password = "alelo@2020";
        return certificateJKS;
    }

    private KeyManager[] keyManager(KeyStore trustStore, String password) throws Exception {
        String defaultAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(defaultAlgorithm);
        keyManagerFactory.init(trustStore, password.toCharArray());
        return keyManagerFactory.getKeyManagers();
    }

    private TrustManager[] trustManager(KeyStore trustStore) throws Exception {
        String defaultAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(defaultAlgorithm);
        trustManagerFactory.init(trustStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        X509TrustManager trustManager = (X509TrustManager) trustManagers[0];
        return new TrustManager[]{trustManager};
    }

    class CertificateP12 {
        String keyStoreFile;
        String password;
    }

    class CertificateJKS {
        String keyStoreFile;
        String password;
    }
}
