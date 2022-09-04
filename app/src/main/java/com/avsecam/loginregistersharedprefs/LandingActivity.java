package com.avsecam.loginregistersharedprefs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;


@EActivity(R.layout.activity_landing)
public class LandingActivity extends AppCompatActivity {

    @ViewById(R.id.labelWelcome) TextView welcomeLabel;

    SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.SHAREDPREFERENCES_NAME), MODE_PRIVATE);

    @AfterViews
    protected void init() {
        String username = sharedPreferences.getString(getString(R.string.USERNAME_KEY), "");
        boolean rememberMe = sharedPreferences.getBoolean(getString(R.string.REMEMBERME_KEY), false);

        String welcomeText = "Welcome " + username + "!!!";
        if (rememberMe) {
            welcomeText += " You will be remembered.";
        }
        welcomeLabel.setText(welcomeText);
    }
}