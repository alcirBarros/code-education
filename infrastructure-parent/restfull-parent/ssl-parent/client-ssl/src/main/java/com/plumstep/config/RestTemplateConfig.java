package com.plumstep.config;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateException;

@Configuration
public class RestTemplateConfig {

    @Value("classpath:truststore.jks")
    private Resource TRUSTSTORE_JKS;

    @Value("classpath:localhost.p12")
    private Resource LOCALHOST_12;

    @Bean
    public RestTemplate restTemplate() throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException {

        KeyStore clientStore = KeyStore.getInstance("PKCS12");
        File file = TRUSTSTORE_JKS.getFile();
        clientStore.load(new FileInputStream(file), "changeit".toCharArray());

        SSLContextBuilder sslContextBuilder = new SSLContextBuilder();
    //    sslContextBuilder.setProtocol("TLS");
        sslContextBuilder.loadKeyMaterial(clientStore, "changeit".toCharArray());
        sslContextBuilder.loadTrustMaterial(new TrustSelfSignedStrategy());

        SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContextBuilder.build());

        CloseableHttpClient httpClient = HttpClients
                .custom()
                .setSSLSocketFactory(sslConnectionSocketFactory)
                .build();

        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
//        requestFactory.setConnectTimeout(properties.getConnectionTimeout());
//        requestFactory.setReadTimeout(properties.getReadTimeout());

        return new RestTemplate(requestFactory);
    }

//    @Bean
//    public RestTemplate restTemplate() throws Exception {
//        TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;
//
//        SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
//
//        SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);
//
//        CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
//
//        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
//        requestFactory.setHttpClient(httpClient);
//
//        RestTemplate restTemplate = new RestTemplate();
//        return restTemplate;
//    }


//    @Bean
//    public SSLContext sslSocketFactory() {
//        try {
//
//            CertificateP12 certificateP12 = certificateP12();
//            CertificateJKS certificateJKS = certificateJKS();
//
//            Base64 base64 = new Base64();
//            KeyStore clientStore = KeyStore.getInstance("PKCS12");
//            InputStream keyStoreInputStream = new FileInputStream(LOCALHOST_12.getFile());
//            clientStore.load(keyStoreInputStream, certificateP12.password.toCharArray());
//
//            KeyStore trustStore = KeyStore.getInstance("JKS");
//            InputStream trustStoreInputStream = new FileInputStream(KEYSTORE_JKS.getFile());
//            trustStore.load(trustStoreInputStream, certificateJKS.password.toCharArray());
//
//            KeyManager[] keyManager = keyManager(clientStore, certificateP12.password);
//            TrustManager[] trustManager = trustManager(trustStore);
//
//            SSLContext sslContext = SSLContext.getInstance("TLS");
//            sslContext.init(keyManager, trustManager, new java.security.SecureRandom());
//
//            return sslContext;
//        } catch (Exception e) {
//            throw new RuntimeException();
//        }
//    }
//
//    private CertificateP12 certificateP12() throws Exception {
//        CertificateP12 certificateP12 = new CertificateP12();
//        certificateP12.password = "changeit";
//        return certificateP12;
//    }
//
//    private CertificateJKS certificateJKS() throws Exception {
//        CertificateJKS certificateJKS = new CertificateJKS();
//        certificateJKS.password = "changeit";
//        return certificateJKS;
//    }
//
//    private KeyManager[] keyManager(KeyStore trustStore, String password) throws Exception {
//        String defaultAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
//        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(defaultAlgorithm);
//        keyManagerFactory.init(trustStore, password.toCharArray());
//        return keyManagerFactory.getKeyManagers();
//    }
//
//    private TrustManager[] trustManager(KeyStore trustStore) throws Exception {
//        String defaultAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
//        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(defaultAlgorithm);
//        trustManagerFactory.init(trustStore);
//        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
//        X509TrustManager trustManager = (X509TrustManager) trustManagers[0];
//        return new TrustManager[]{trustManager};
//    }
//
//    class CertificateP12 {
//        String password;
//    }
//
//    class CertificateJKS {
//        String password;
//    }
}