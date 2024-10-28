package br.com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationSpringBoot implements CommandLineRunner {

//    OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private MyStompSessionHandler myStompSessionHandler;


    public static void main(String[] args) {
        SpringApplication.run(ApplicationSpringBoot.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        while (true){
//            Thread.sleep(1000);
//            myStompSessionHandler.sendAllMessage("TESTE");
//        }
////
//        Call<List<User>> userList = userService.userList();
//        userList.enqueue(new Callback<List<User>>() {
//            @Override
//            public void onResponse(Call<List<User>> arg0, Response<List<User>> arg1) {
//                List<User> body = arg1.body();
//            }
//
//            @Override
//            public void onFailure(Call<List<User>> arg0, Throwable arg1) {
//
//            }
//        });
//
    }

}
