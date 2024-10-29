package br.com.amazon;


import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.kms.model.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.ByteBuffer;
import java.sql.SQLException;


@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SpringApplicationTest {


    @Autowired
    private AWSKMS awskms;

    private static String keyId;

    @BeforeAll
    public void setup() {
        CreateKeyRequest request = new CreateKeyRequest();
        CreateKeyResult result = awskms.createKey(request);
        keyId = result.getKeyMetadata().getKeyId();
        System.out.println("Key created with ID: " + keyId);
    }

//    @Test
//    public void encryptData() {
//        String teste = "textplan";
//        EncryptRequest request = new EncryptRequest().withKeyId(keyId).withPlaintext(ByteBuffer.wrap(teste.getBytes()));
//        EncryptResult result = awskms.encrypt(request);
//        ByteBuffer ciphertext = result.getCiphertextBlob();
//        System.out.println("Data encrypted successfully: " + ciphertext);
//
//        DecryptRequest request_ = new DecryptRequest().withCiphertextBlob(ciphertext).withEncryptionContext(keyId);
//        DecryptResult result_ = awskms.decrypt(request_);
//        ByteBuffer plaintext = result_.getPlaintext();
//        System.out.println("Data decrypted successfully: " + new String(plaintext.array()));
//    }

    @Test
    public void test01() throws SQLException {
        String keyId = "arn:aws:kms:sa-east-1:000000000000:key/4b9498f9-026b-42c5-804a-7bf26c88bb33";

        GenerateDataKeyRequest dataKeyRequest = new GenerateDataKeyRequest();
        dataKeyRequest.setKeyId(keyId);
        dataKeyRequest.setKeySpec("AES_256");

        GenerateDataKeyResult dataKeyResult = awskms.generateDataKey(dataKeyRequest);

        ByteBuffer plaintext = dataKeyResult.getPlaintext();
        ByteBuffer encryptedKey = dataKeyResult.getCiphertextBlob();
    }


    @Test
    public void test02() throws SQLException {
        String keyId = "arn:aws:kms:sa-east-1:000000000000:key/4b9498f9-026b-42c5-804a-7bf26c88bb33";

        DescribeKeyRequest req = new DescribeKeyRequest().withKeyId(keyId);
        DescribeKeyResult result = awskms.describeKey(req);
    }
}
