package com.example.gabrielamistral.di;

import com.example.gabrielamistral.ui.activities.LoginActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton//una unica instancia de este component
@Component(modules = RetrofitModule.class)//con que modulo esta asociado
public interface RetrofitComponent {
    //Component en Dagger, es un puente entre los modulos creados y la parte del codigo que necesita esos objetos par ahacer la inyeccion de dependencias(activity/fragment)
    //Y en la clase MyApp que extiende de Application continuo la implementacion

    void inject(LoginActivity loginActivity);//el parametro es la clase en donde va a ser inyectado para que haga uso de las inyecciones que tiene el modulo RetrofitModule
}
