package com.plumstep;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;

import javax.net.ssl.*;
import java.io.File;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.util.Enumeration;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ClientApplicationTest {

    @Value("classpath:keystore.jks")
    private Resource insertDataBase;

    @Test
    public void contextLoads() throws Exception{

        File file = insertDataBase.getFile();

        KeyStore keyStore = KeyStore.getInstance(file, "changeit".toCharArray());

        Enumeration<String> enumeration = keyStore.aliases();

        String defaultAlgorithm = KeyManagerFactory.getDefaultAlgorithm();

        while(enumeration.hasMoreElements()) {
            String alias = enumeration.nextElement();
            System.out.println("alias name: " + alias);
            Certificate certificate = keyStore.getCertificate(alias);
            System.out.println(certificate.toString());
        }

        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(defaultAlgorithm);

        String defaultAlgorithm02 = TrustManagerFactory.getDefaultAlgorithm();

        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(defaultAlgorithm);
        keyManagerFactory.init(keyStore, "changeit".toCharArray());
        KeyManager[] keyManager = keyManagerFactory.getKeyManagers();
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        X509TrustManager trustManager = (X509TrustManager) trustManagers[0];

        TrustManager[] trustManagers1 = {trustManager};

        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(keyManager, trustManagers1, new java.security.SecureRandom());
    }


}
