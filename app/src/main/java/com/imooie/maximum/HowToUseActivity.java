package com.imooie.maximum;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class HowToUseActivity extends AppCompatActivity {
    private final Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_use);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_item1:
                        finish();
                        startActivity(new Intent(mContext, Common_QuestionsActivity.class));

                        break;
                    case R.id.action_item2:
                        finish();
                        startActivity(new Intent(mContext, ContactUsActivity.class));

                        break;
                    case R.id.action_item3:
                        finish();
                        startActivity(new Intent(mContext, MainActivity.class));

                        break;
                    case R.id.action_item4:
                        finish();
                        startActivity(new Intent(mContext, VideosActivity.class));

                        break;
                    case R.id.action_item5:
                        finish();
                        startActivity(new Intent(mContext, StuffActivity.class));

                        break;
                }
                return false;
            }
        });
    }


    public void onBackPressed() {
        finish();
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }
}
