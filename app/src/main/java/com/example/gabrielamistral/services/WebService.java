package com.example.gabrielamistral.services;


import com.example.gabrielamistral.model.request.RequestLogin;
import com.example.gabrielamistral.model.response.ResponseLogin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface WebService {

    @POST("select_logueo_user.php")
    Call<ResponseLogin> login(@Body RequestLogin requestLogin);
}
