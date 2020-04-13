/*
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

        retrofitInit();
    }


    private void retrofitInit(){
        loggingInterceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);//para ver los datos enviados y recibidos en consola
        httpClientBuilder = new OkHttpClient.Builder().addInterceptor(loggingInterceptor);//httpclient aplica el interceptor para que se pueda usar
        retrofit = new Retrofit.Builder()
                .baseUrl(Constantes.BASE_URL)//constante
                .addConverterFactory(GsonConverterFactory.create()) //parsear de java a json y viceversa
                .client(httpClientBuilder.build()) //el cliente que vamos a usar, para que aplique la funcionalidad del interceptor
                .build();

        webService = retrofit.create(WebService.class); //instancio el servicio para poder usar las peticiones
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
*/
