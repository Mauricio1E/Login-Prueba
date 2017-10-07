package com.mauricio.practica1;

import android.nfc.Tag;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class LoginActivity extends BaseActivity {

private Toolbar toolbar;

    private static final String TAG = LoginActivity.class.getName() ;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        super.initView();
        initConfigToolbar();
    }

    private void initConfigToolbar(){
        toolbar=getToolbar();
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_white_24dp));
    }

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "Entro al on create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Entro al onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "Entro al onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "entro al onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "entro al onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "entro al onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "entro al onDestroyed");
    }*/
}
