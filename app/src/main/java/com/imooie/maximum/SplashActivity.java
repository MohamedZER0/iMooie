package com.imooie.maximum;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private final Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        String MY_PREF = "my_pref";
        SharedPreferences loginPreference = getSharedPreferences(MY_PREF, Context.MODE_PRIVATE);

        if (loginPreference.getString("tag", "notok").equals("notok")) {

            SharedPreferences.Editor edit = loginPreference.edit();
            edit.putString("tag", "ok");
            edit.apply();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(mContext, IntroActivity.class));
                }
            }, 1000);

        } else if (loginPreference.getString("tag", null).equals("ok")) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(mContext, MainActivity.class));
                }
            }, 1000);
        }
    }
}
