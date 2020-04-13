package com.example.gabrielamistral.di;

import com.example.gabrielamistral.services.WebService;
import com.example.gabrielamistral.utils.Constantes;
import com.example.gabrielamistral.utils.Utils;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class RetrofitModule {
//Dependencias listas para ser inyectadas en cualquier lugar, en donde tengo una unica instancia para que use toda la app
    //Devolver instancia de Gson
    @Singleton
    @Provides
    GsonConverterFactory provideGsonConverterFactory(){
        return GsonConverterFactory.create();
    }

    //Devolver instancia de HttpLoginInterceptor
    @Singleton
    @Provides
    HttpLoggingInterceptor provideHttpLoggingInterceptor(){
        return new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    @Singleton
    @Provides
    RxJava2CallAdapterFactory provideRxJava2CallAdapterFactory(){//para parsear las respuestas de la api en rxjava y usar los observables y observers
        return RxJava2CallAdapterFactory.create();
    }

    @Singleton
    @Provides
    OkHttpClient providesOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor){ //el parametro que necesita lo toma del grafo de esta clase
        return new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();
    }

    @Singleton
    @Provides
    Retrofit providesRetrofit(GsonConverterFactory gsonConverterFactory, OkHttpClient okHttpClient, RxJava2CallAdapterFactory rxJava2CallAdapterFactory){
        return new Retrofit.Builder()
                .baseUrl(Constantes.BASE_URL)//constante
                .addConverterFactory(GsonConverterFactory.create()) //parsear de java a json y viceversa
                .addCallAdapterFactory(rxJava2CallAdapterFactory) //para parsear las respuestas de la api en rxjava y usar los observables y observers
                .client(okHttpClient) //el cliente que vamos a usar, para que aplique la funcionalidad del interceptor
                .build();
    }

    @Singleton
    @Provides
    Utils providesUtils(){
        return new Utils();
    }

    @Singleton
    @Provides
    WebService providesWebService(Retrofit retrofit){
        return retrofit.create(WebService.class);
    }



}
