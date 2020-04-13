package com.example.gabrielamistral.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.model.request.RequestLogin;
import com.example.gabrielamistral.model.response.ResponseLogin;
//import com.example.gabrielamistral.services.RetrofitClientApi;
import com.example.gabrielamistral.services.WebService;
import com.example.gabrielamistral.utils.BaseApplication;
import com.example.gabrielamistral.utils.Utils;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private MaterialButton btnLogin;
    private TextInputEditText textInputEditTextUsername;
    private TextInputEditText textInputEditTextPassword;

    private Disposable disposable; //eliminar relacion entre Observable y Observador para evitar el consumo innecesario de memoria cuando se destruye el Activity

    @Inject
    WebService webServiceClient;

    @Inject
    Utils utils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        daggerInit();
        setVisualResources();
        events();

        /*crearObservable()
                .subscribeOn(Schedulers.io())//en que hilo se ejectura el Observable, uno secundario que elije el SO
                .observeOn(AndroidSchedulers.mainThread())//donde se ejecuta el Observer, esto es el hilo principal por que modifica la ui del usuario
                .subscribe(crearObserver());//indicamos al observador que va a estar observando a este Observable*/

    }
    //iniciar dagger en esta actividad para que funcionen los Inject
    private void daggerInit() {
        ((BaseApplication)getApplication()).getRetrofitComponent().inject(this);
    }

    private void events() {
        btnLogin.setOnClickListener(this);
    }


    private void setVisualResources(){
        btnLogin = findViewById(R.id.btnLogin);
        textInputEditTextPassword = findViewById(R.id.TextInputEditTextPassword);
        textInputEditTextUsername = findViewById(R.id.TextInputEditTextUsername);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                goToLogin();
        }
    }

    private void goToLogin() {
        String username = textInputEditTextUsername.getText().toString();
        String password = textInputEditTextPassword.getText().toString();

        if(username.isEmpty()){
            textInputEditTextUsername.setError("El username es requerido");
        }else if(password.isEmpty()){
            textInputEditTextPassword.setError("La contraseña es requerida");
        }else{

            RequestLogin requestLogin = new RequestLogin(username,password);

            webServiceClient.doLoginObservable(requestLogin)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            new Observer<ResponseLogin>() {
                                @Override
                                public void onSubscribe(Disposable d) {
                                    disposable = d;
                                }

                                @Override
                                public void onNext(ResponseLogin responseLogin) {
                                    Toast.makeText(LoginActivity.this, "GET USUARIO: "+responseLogin.getUsuario(), Toast.LENGTH_SHORT).show();
                                    utils.changeActivitySimple(DashboardAdminActivity.class, BaseApplication.getContext());
                                    finish();
                                }

                                @Override
                                public void onError(Throwable e) {
                                    Toast.makeText(LoginActivity.this, "Problemas de conexión", Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void onComplete() {
                                    Toast.makeText(LoginActivity.this, "on complete!", Toast.LENGTH_SHORT).show();
                                }
                            }
                    );
        }

    }
    
    /*private Observable crearObservable(){
        return Observable.create(new ObservableOnSubscribe<String>() { //en vez de String deberia ser ResponseLogin en este caso o el tipo de Observable
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {
                try {
                    emitter.onNext("Primer dato que emite el Observable");//datos que voy a emitir
                    emitter.onComplete();//el Observable dejo de emitir datos
                }catch (Exception e){
                    emitter.onError(e);
                }
            }
        });
    }

    private Observer crearObserver(){ //recibe los datos del Observable
        return  new Observer<String>(){

            @Override
            public void onSubscribe(Disposable d) {
                disposable = d;
            }

            @Override
            public void onNext(String s) {
                //recibir datos que lanza el Observable
                Log.d("TAG1", "onNext del OBserver que se activa cuando recibio los datos del Observable como ahora");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                Log.d("TAG1", "onComplete del OBserver que se activa cuando dejo de recibir los datos del Observable como ahora");
            }
        };
    }*/

    @Override
    protected void onDestroy() {
        super.onDestroy();
        disposable.dispose();//aplica uso del disposable
    }
}
