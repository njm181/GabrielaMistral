package com.example.gabrielamistral.services;


import com.example.gabrielamistral.model.request.RequestLogin;
import com.example.gabrielamistral.model.response.ResponseLogin;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface WebService {
    //crear pojo de respuestas para los inserts y para los selects
    /*@POST("select_logueo_user.php")
    Call<ResponseLogin> login(@Body RequestLogin requestLogin);*/

    @POST("select_logueo_user.php")
    Observable<ResponseLogin> doLoginObservable(@Body RequestLogin requestLogin);



}
