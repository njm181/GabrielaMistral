package com.example.gabrielamistral.utils;

import android.app.Application;
import android.content.Context;

//gestionar el acceso al contexto
public class MyApp extends Application {
    private static MyApp instance;
    //lo vinculamos en el manifest
    public static MyApp getInstance(){
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
    }
}
