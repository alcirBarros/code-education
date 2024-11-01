package br.com.security;

import br.com.SpringBootInstituicaoApplicationSecurity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
@SpringBootTest(classes = SpringBootInstituicaoApplicationSecurity.class)
public class SecurityTest {

    private static final String password = "admin";

    private static final String passwordEcripted = "$2a$16$Wb.2Ng4wkluyxKaT42QN9OqgttLGayJsjGs6j2hcXEmUKkktVie.y";

    private static final String passwordBcrypt = "{bcrypt}$2a$10$q.3y546qb9XVwRsIjRQlBOQKDm9xKK8ejodb/WljPOya7kBm19Wn6";
    private static final String passwordLdap = "{ldap}{SSHA}FOFbmJl2dJRi4AiCJxoc4O0AOG5zUWgbq2RJLA==";
    private static final String passwordMD4 = "{MD4}{Tc3uSksZPUXAN4pvst8UqMe8NnfQPIR1fUotoOvQlr4=}cffa0868e297370ba31cc35620ceefd3";
    private static final String passwordNoop = "{noop}admin";
    private static final String passwordPbkdf2 = "{pbkdf2}8f4dfa46fa1299cacb443fd76c570a610e86b7ab36a186fa6e9099fa528772da6d992e5e6f187cc3";
    private static final String passwordScrypt = "{scrypt}$e0801$s4mfSHplP1OaLQJt6X9uE5SyFeM50wD4FB3sboKuTTtJ1yIFRnP0xQmznScaItLenQvRFYmRCdwKytYm8ILR/A==$t8lPzSuENdBOBENlsUpqH3YzA4t/kxbOmeAdvH+Id3U=";
    private static final String passwordSHA_1 = "{SHA-1}{4mGmj2sM56s15SpRu+GFj9YWL39OrYgITaC9mrZSXj4=}838dab77d15661ab9224733611b03b98e4c6a963";
    private static final String passwordSHA_256 = "{SHA-256}{lBTnWSyVAgfwAgm2Y4bRsE1gHV4tkrYFW7QzXvh8HmI=}7ff26f1599402a9415addd63381524fbd7c9152e394b003b9013943a20d26cdd";
    private static final String passwordSha256 = "{sha256}7d1c61e9eff048202b22782e9d67cd4fe92d6835b9f1cd5982bcd9f13c6e033e4e5521027231471a";

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void passwordEncoderTeste() {
        boolean matches = passwordEncoder.matches(password, passwordEcripted);
        System.out.println(matches);
    }

    static class CustomPasswordEncoder extends BCryptPasswordEncoder implements PasswordEncoder  {

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        Map<String, PasswordEncoder> encoders = new HashMap<>();
        encoders.put("bcrypt", new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder());
        encoders.put("ldap", new org.springframework.security.crypto.password.LdapShaPasswordEncoder());
        encoders.put("MD4", new org.springframework.security.crypto.password.Md4PasswordEncoder());
        encoders.put("MD5", new org.springframework.security.crypto.password.MessageDigestPasswordEncoder("MD5"));
        encoders.put("noop", org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance());
        encoders.put("pbkdf2", new org.springframework.security.crypto.password.Pbkdf2PasswordEncoder());
        encoders.put("scrypt", new org.springframework.security.crypto.scrypt.SCryptPasswordEncoder());
        encoders.put("SHA-1", new org.springframework.security.crypto.password.MessageDigestPasswordEncoder("SHA-1"));
        encoders.put("SHA-256", new org.springframework.security.crypto.password.MessageDigestPasswordEncoder("SHA-256"));
        encoders.put("sha256", new org.springframework.security.crypto.password.StandardPasswordEncoder());

        DelegatingPasswordEncoder delegatingPasswordEncoder = new DelegatingPasswordEncoder("pbkdf2", encoders);
        delegatingPasswordEncoder.setDefaultPasswordEncoderForMatches(new CustomPasswordEncoder());
        return delegatingPasswordEncoder;
    }
}
