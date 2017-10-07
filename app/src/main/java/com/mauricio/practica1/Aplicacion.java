package com.mauricio.practica1;

import android.app.Application;
import android.util.Log;

/**
 * Created by mauricio on 30/09/2017.
 */

public class Aplicacion extends Application{

    private static final String TAG = Application.class.getName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "Entro a la clase aplicacion");
    }
}
