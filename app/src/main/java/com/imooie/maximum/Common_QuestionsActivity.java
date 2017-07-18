package com.imooie.maximum;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Common_QuestionsActivity extends AppCompatActivity {

    private final Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_questions);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_item4:
                        finish();
                        startActivity(new Intent(mContext, VideosActivity.class));
                        break;
                    case R.id.action_item2:
                        finish();
                        startActivity(new Intent(mContext, ContactUsActivity.class));
                        break;
                    case R.id.action_item3:
                        finish();
                        startActivity(new Intent(mContext, MainActivity.class));
                        break;
                    case R.id.action_item5:
                        finish();
                        startActivity(new Intent(mContext, StuffActivity.class));
                        break;
                }
                return false;
            }
        });

        String[] questionsArray = {
                getResources().getString(R.string.How_To_Use),
                getResources().getString(R.string.About_Activity),
                getResources().getString(R.string.content_1_detail),
                getResources().getString(R.string.content_2_detail),
                getResources().getString(R.string.content_3_detail),
                getResources().getString(R.string.content_4_detail),
                getResources().getString(R.string.How_To_Use)
        };


        final ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(mContext, R.layout.list_items_form, R.id.list_item_textview, questionsArray);


        //List<String> commonQArrayList = new ArrayList<>(Arrays.asList(questionsArray));
        ListView QListView = (ListView) findViewById(R.id.list_view);
        QListView.setAdapter(stringArrayAdapter);
        QListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Q = stringArrayAdapter.getItem(position);
                Intent intent = (new Intent(mContext, QuestionsDetailsActivity.class).putExtra(Intent.EXTRA_TEXT, Q));
                startActivity(intent);
            }
        });
    }

    public void onBackPressed() {
        finish();
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }
}