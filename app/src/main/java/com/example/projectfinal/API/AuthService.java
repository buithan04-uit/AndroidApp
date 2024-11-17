package com.example.projectfinal.API;

import com.example.projectfinal.Module.LoginRequest;
import com.example.projectfinal.Module.User;
import com.example.projectfinal.Module.TokenResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AuthService {
    @GET("sign_up")
    Call<ResponseBody> signUp(@Body User user);

    @POST("/log_in")
    Call<TokenResponse> logIn(@Body LoginRequest loginRequest);
}