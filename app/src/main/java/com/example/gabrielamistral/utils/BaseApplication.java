package com.example.gabrielamistral.utils;

import android.app.Application;
import android.content.Context;

import com.example.gabrielamistral.di.DaggerRetrofitComponent;
import com.example.gabrielamistral.di.RetrofitComponent;
import com.example.gabrielamistral.di.RetrofitModule;

//gestionar el acceso al contexto
public class BaseApplication extends Application {

    private RetrofitComponent retrofitComponent;

    private static BaseApplication instance;
    //lo vinculamos en el manifest
    public static BaseApplication getInstance(){
        return instance;
    }

    //obtener el contexto de la aplicacion
    public static Context getContext(){
        return instance;
    }

    @Override
    public void onCreate() {
        //se crea cuando se ejecuta la app
        instance = this;
        super.onCreate();
        //genere la clase de Dagger
        retrofitComponent = DaggerRetrofitComponent
                .builder()
                .retrofitModule(new RetrofitModule())
                .build();
    }

    //unica intanciacion del objeto para la reutilizacion  en la app en cualquier momento
    public RetrofitComponent getRetrofitComponent(){
        return retrofitComponent;
    }
}
