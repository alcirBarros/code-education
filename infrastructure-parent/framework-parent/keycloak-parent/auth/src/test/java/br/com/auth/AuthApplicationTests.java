package br.com.auth;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Map;

@SpringBootTest
class AuthApplicationTests {

	@Test
	void contextLoads() {
		DecodedJWT decodedJWT = getUsername("token");
		String algorithm = decodedJWT.getAlgorithm();
		String contentType = decodedJWT.getContentType();
		String keyId = decodedJWT.getKeyId();
		String subject = decodedJWT.getSubject();
		Map<String, Claim> claims = decodedJWT.getClaims();
	}

	public DecodedJWT getUsername(String token) {
		DecodedJWT decodedJWT = JWT.decode(token);
		return decodedJWT;
	}
}
