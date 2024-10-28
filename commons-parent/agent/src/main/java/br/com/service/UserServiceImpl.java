package br.com.service;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Retrofit;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private Retrofit retrofit;

    private UserService userService;

    @PostConstruct
    public void setup() {
        userService = retrofit.create(UserService.class);
    }

    @Override
    public Call<User> user(String accessToken) {
        return userService.user(accessToken);
    }

    @Override
    public Call<List<User>> userList() {
        return userService.userList();
    }

    @Override
    public Call<User> user(User user) {
        return userService.user(user);
    }

}
