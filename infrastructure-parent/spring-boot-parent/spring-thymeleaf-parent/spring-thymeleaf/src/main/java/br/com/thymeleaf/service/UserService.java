package br.com.thymeleaf.service;

import br.com.thymeleaf.model.User;
import br.com.thymeleaf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Page<User> findAll(Pageable pageable) {
        Page<User> userPage = userRepository.findAll(pageable);
//        List<User> collect = userList.stream().filter(x -> x.getId() <= 5).collect(Collectors.toList());
//        Page<User> userPage = new PageImpl<>(collect, pageable, userList.size());
        return userPage;
    }
}
