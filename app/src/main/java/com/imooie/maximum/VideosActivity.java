package com.imooie.maximum;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideosActivity extends AppCompatActivity {
    private final Context mContext = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
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
                    case R.id.action_item5:
                        finish();
                        startActivity(new Intent(mContext, StuffActivity.class));

                        break;
                }
                return false;
            }
        });
        final VideoView Video_1 = (VideoView) findViewById(R.id.Video_1);
        final VideoView Video_2 = (VideoView) findViewById(R.id.Video_2);
        final VideoView Video_3 = (VideoView) findViewById(R.id.Video_3);
        final Button btn_1 = (Button) findViewById(R.id.btn_1);
        final Button btn_2 = (Button) findViewById(R.id.btn_2);
        final Button btn_3 = (Button) findViewById(R.id.btn_3);
        final Button btn_1_s = (Button) findViewById(R.id.btn_1_s);
        final Button btn_2_s = (Button) findViewById(R.id.btn_2_s);
        final Button btn_3_s = (Button) findViewById(R.id.btn_3_s);
        final MediaController mediaController = new MediaController(mContext);
        mediaController.setAnchorView(Video_1);
        mediaController.setAnchorView(Video_2);
        mediaController.setAnchorView(Video_3);

        String path = "android.resource://" + getPackageName() + "/" + R.raw.epic_car_chase;
        Video_1.setVideoURI(Uri.parse(path));
        btn_1_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_1.setVisibility(View.VISIBLE);
                btn_1_s.setVisibility(View.GONE);


                Video_1.stopPlayback();
                Video_2.stopPlayback();
                Video_3.stopPlayback();


                Video_2.setVisibility(View.GONE);
                Video_3.setVisibility(View.GONE);
                Video_1.setVisibility(View.GONE);

            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_3_s.setVisibility(View.GONE);
                btn_2_s.setVisibility(View.GONE);
                btn_1.setVisibility(View.GONE);


                btn_1_s.setVisibility(View.VISIBLE);
                btn_2.setVisibility(View.VISIBLE);
                btn_3.setVisibility(View.VISIBLE);

                Video_2.setVisibility(View.GONE);
                Video_3.setVisibility(View.GONE);
                Video_2.stopPlayback();
                Video_3.stopPlayback();
                Video_1.setVisibility(View.VISIBLE);
                Video_1.setMediaController(mediaController);
                Video_1.bringToFront();
                Video_1.start();

            }

        });
        Video_1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Video_1.stopPlayback();
                Video_1.setVisibility(View.GONE);
            }
        });

        String path2 = "android.resource://" + getPackageName() + "/" + R.raw.mini_need_for_speed;
        Video_2.setVideoURI(Uri.parse(path2));
        btn_2_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_2.setVisibility(View.VISIBLE);
                btn_2_s.setVisibility(View.GONE);


                Video_1.stopPlayback();
                Video_2.stopPlayback();
                Video_3.stopPlayback();


                Video_2.setVisibility(View.GONE);
                Video_3.setVisibility(View.GONE);
                Video_1.setVisibility(View.GONE);

            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_3_s.setVisibility(View.GONE);
                btn_1_s.setVisibility(View.GONE);
                btn_2.setVisibility(View.GONE);


                btn_2_s.setVisibility(View.VISIBLE);
                btn_1.setVisibility(View.VISIBLE);
                btn_3.setVisibility(View.VISIBLE);

                Video_3.setVisibility(View.GONE);
                Video_1.setVisibility(View.GONE);
                Video_3.stopPlayback();
                Video_1.stopPlayback();
                Video_2.setVisibility(View.VISIBLE);
                Video_2.setMediaController(mediaController);
                Video_2.bringToFront();
                Video_2.start();

            }

        });
        Video_2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Video_2.stopPlayback();
                Video_2.setVisibility(View.GONE);
            }
        });
        String path3 = "android.resource://" + getPackageName() + "/" + R.raw.fight;
        Video_3.setVideoURI(Uri.parse(path3));
        btn_3_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_3.setVisibility(View.VISIBLE);
                btn_3_s.setVisibility(View.GONE);


                Video_1.stopPlayback();
                Video_2.stopPlayback();
                Video_3.stopPlayback();


                Video_2.setVisibility(View.GONE);
                Video_3.setVisibility(View.GONE);
                Video_1.setVisibility(View.GONE);

            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_2_s.setVisibility(View.GONE);
                btn_1_s.setVisibility(View.GONE);
                btn_3.setVisibility(View.GONE);


                btn_3_s.setVisibility(View.VISIBLE);
                btn_1.setVisibility(View.VISIBLE);
                btn_2.setVisibility(View.VISIBLE);

                Video_1.stopPlayback();
                Video_2.stopPlayback();
                Video_1.setVisibility(View.GONE);
                Video_2.setVisibility(View.GONE);
                Video_3.setVisibility(View.VISIBLE);
                Video_3.setMediaController(mediaController);
                Video_3.bringToFront();
                Video_3.start();

            }

        });
        Video_3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Video_3.stopPlayback();
                Video_3.setVisibility(View.GONE);
            }
        });
    }


    public void onBackPressed() {
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }

}