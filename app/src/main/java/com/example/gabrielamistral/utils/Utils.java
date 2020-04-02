package com.example.gabrielamistral.utils;

import android.content.Context;
import android.content.Intent;

public class Utils {

    public void changeActivity(Class clase, String tipo, Context context){
        Intent intent = new Intent(context, clase);
        intent.putExtra("TIPO", tipo);
        context.startActivity(intent);
    }

    public void changeActivitySimple(Class clase, Context context){
        Intent intent = new Intent(context, clase);
        context.startActivity(intent);
    }



}
