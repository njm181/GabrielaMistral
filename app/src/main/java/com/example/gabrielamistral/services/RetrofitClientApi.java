package com.example.gabrielamistral.services;

import com.example.gabrielamistral.utils.Constantes;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientApi {

    private static RetrofitClientApi instance = null;
    private WebService webService;
    private Retrofit retrofit;

    public RetrofitClientApi() {
        retrofit = new Retrofit.Builder()
                .baseUrl(Constantes.BASE_URL)//constante
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        webService = retrofit.create(WebService.class);
    }

    //singleton luego migrar a dagger2
    public static RetrofitClientApi getInstance(){
        if(instance == null){
            instance = new RetrofitClientApi();
        }
        return instance;
    }

    public WebService getWebService(){
        return webService;
    }
}
