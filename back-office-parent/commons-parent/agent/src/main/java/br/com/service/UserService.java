package br.com.service;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UserService {

    @GET
    Call<User> user(@Header("Authorization") String accessToken);

    @GET(".")
    Call<List<User>> userList();

    @POST("/create")
    Call<User> user(@Body User user);
}
