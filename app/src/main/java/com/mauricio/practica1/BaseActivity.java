package com.mauricio.practica1;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        binButterknife();
        onPrepareToolbar();
        initView();

    }

    @LayoutRes
    protected abstract int getLayoutResId();

    public Toolbar getToolbar() {
        return toolbar;
    }

    private
    void onPrepareToolbar(){
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("");
        if (toolbar!=null){
            setSupportActionBar(toolbar);
        }
    }

    /**
     * Aqui se configura el toolbar si es que existe en el layout
     */

    protected  void initView(){
        /**
         * Aqui la vista ya fue craeda
         */
    }

    private void binButterknife(){
        ButterKnife.bind(this);
    }



}
