package com.example.gabrielamistral.services;

import com.example.gabrielamistral.utils.Constantes;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientApi {

    private static RetrofitClientApi instance = null;
    private WebService webService;
    private Retrofit retrofit;
    private HttpLoggingInterceptor loggingInterceptor;
    private OkHttpClient.Builder httpClientBuilder;


    public RetrofitClientApi() {

        loggingInterceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClientBuilder = new OkHttpClient.Builder().addInterceptor(loggingInterceptor);
        retrofit = new Retrofit.Builder()
                .baseUrl(Constantes.BASE_URL)//constante
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClientBuilder.build())
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
