package com.mauricio.practica1;

import android.nfc.Tag;
import android.os.Bundle;
import android.speech.tts.Voice;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {


    private static final String TAG = LoginActivity.class.getName();


    private Toolbar toolbar;

    @BindView(R.id.edt_email)
    EditText email;
    @BindView(R.id.text_email)
    TextInputLayout textEmail;
    @BindView(R.id.edt_password)
    EditText password;
    @BindView(R.id.text_password)
    TextInputLayout textPassword;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        super.initView();
        initConfigToolbar();
    }

    private void initConfigToolbar() {
        toolbar = getToolbar();
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_white_24dp));
    }

    @OnClick(R.id.btn_entrar)
    public void onClickLogin() {
        if (isValidLogin()) {

        }

    }

    public boolean isValidLogin() {
        boolean valid = true;
        textEmail.setError(null);
        textPassword.setError(null);
        textEmail.setErrorEnabled(false);
        textPassword.setErrorEnabled(false);
        if (email.getText().toString().isEmpty()) {
            valid = false;
            textEmail.setError(getString(R.string.login_text_error_is_empty_email));
        }
        if (password.getText().toString().isEmpty()) {
            valid = false;
            textPassword.setError(getString(R.string.login_text_error_is_empty_password));
        }
        if (!isEmailValid(email.getText().toString())){
            valid=false;
            textEmail.setError(getString(R.string.login_text_error_is_valis_email));
        }
        return valid;

    }

    private boolean isEmailValid(CharSequence charSequence){
        if (TextUtils.isEmpty(charSequence)){
            return false;
        }else{
            return Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
        }
    }
}
