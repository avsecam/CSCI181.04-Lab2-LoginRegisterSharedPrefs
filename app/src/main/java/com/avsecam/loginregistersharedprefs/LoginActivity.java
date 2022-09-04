package com.avsecam.loginregistersharedprefs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {
    @ViewById(R.id.editTextUsername) EditText usernameField;
    @ViewById(R.id.editTextPassword) EditText passwordField;
    @ViewById(R.id.checkBoxRememberMe) CheckBox rememberMeCheckBox;

    SharedPreferences sharedPreferences = getSharedPreferences("data", MODE_PRIVATE);
    SharedPreferences.Editor editor = sharedPreferences.edit();

    @Click(R.id.buttonSignIn)
    public void onLoginButtonPressed() {

    }

    @Click(R.id.buttonRegister)
    public void onRegisterButtonPressed() {

    }

    @Click(R.id.buttonClear)
    public void onClearButtonPressed() {
        usernameField.setText("");
        passwordField.setText("");
    }
}