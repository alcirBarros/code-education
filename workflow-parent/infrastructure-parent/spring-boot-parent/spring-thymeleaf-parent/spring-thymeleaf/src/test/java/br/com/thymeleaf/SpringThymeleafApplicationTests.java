package br.com.thymeleaf;

import br.com.thymeleaf.model.User;
import br.com.thymeleaf.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringThymeleafApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
        PageRequest pageRequest = PageRequest.of(1, 5);
        Page<User> userPage = userRepository.findAll(pageRequest);
        assertNotNull(userPage);
    }

}
