package com.example.gabrielamistral.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.gabrielamistral.R;
import com.example.gabrielamistral.model.request.RequestLogin;
import com.example.gabrielamistral.model.response.ResponseLogin;
import com.example.gabrielamistral.services.RetrofitClientApi;
import com.example.gabrielamistral.services.WebService;
import com.example.gabrielamistral.utils.MyApp;
import com.example.gabrielamistral.utils.Utils;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private MaterialButton btnLogin;
    private TextInputEditText textInputEditTextUsername;
    private TextInputEditText textInputEditTextPassword;
    private RetrofitClientApi retrofitClientApi;
    private WebService webService;

    //pasar a dagger
    private Utils utils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setVisualResources();
        retrofitInit();
        events();

    }

    private void retrofitInit() {
        retrofitClientApi = RetrofitClientApi.getInstance();
        webService = retrofitClientApi.getWebService();
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
        utils = new Utils();
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

            Call<ResponseLogin> call = webService.login(requestLogin);
            call.enqueue(new Callback<ResponseLogin>() {
                @Override
                public void onResponse(Call<ResponseLogin> call, Response<ResponseLogin> response) {
                    if(response.isSuccessful()){
                        Toast.makeText(LoginActivity.this, "Sesión iniciada", Toast.LENGTH_SHORT).show();
                        utils.changeActivitySimple(DashboardAdminActivity.class, MyApp.getContext());
                        finish();
                    }else{
                        Toast.makeText(LoginActivity.this, "Credenciales erroneas", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<ResponseLogin> call, Throwable t) {
                    Toast.makeText(LoginActivity.this, "Problemas de conexión", Toast.LENGTH_SHORT).show();
                }
            });
        }

    }


}
