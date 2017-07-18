package com.imooie.maximum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void howToUse(View view) {
        startActivity(new Intent(this, HowToUseActivity.class));
    }


    public void videos(View view) {
        startActivity(new Intent(this, VideosActivity.class));
    }


    public void about(View view) {
        startActivity(new Intent(this, AboutActivity.class));
    }


    public void contactUs(View view) {
        startActivity(new Intent(this, ContactUsActivity.class));
    }


    public void stuff(View view) {
        startActivity(new Intent(this, StuffActivity.class));
    }


    public void commonQuestions(View view) {
        startActivity(new Intent(this, Common_QuestionsActivity.class));
    }


    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}