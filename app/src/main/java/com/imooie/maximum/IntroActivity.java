package com.imooie.maximum;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.FloatRange;
import android.view.View;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import agency.tango.materialintroscreen.SlideFragmentBuilder;
import agency.tango.materialintroscreen.animations.IViewTranslation;

public class IntroActivity extends MaterialIntroActivity {

    private final Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableLastSlideAlphaExitTransition(true);

        getBackButtonTranslationWrapper()
                .setEnterTranslation(new IViewTranslation() {
                    @Override
                    public void translate(View view, @FloatRange(from = 0, to = 1.0) float percentage) {
                        view.setAlpha(percentage);
                    }
                });

        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorAccent)
                .buttonsColor(R.color.intro)
                .image(R.drawable.edit_intro)
                .title("Privacy")
                .description("Personalized and Privacy treatment")
                .build());


        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorAccent)
                .buttonsColor(R.color.intro)
                .image(R.drawable.edit_intro)
                .title("Privacy")
                .description("Personalized and Privacy treatment")
                .build());


        addSlide(new SlideFragmentBuilder()
                .backgroundColor(R.color.colorAccent)
                .buttonsColor(R.color.intro)
                .image(R.drawable.edit_intro)
                .title("Privacy")
                .description("Personalized and Privacy treatment")
                .build());
    }

    @Override
    public void onFinish() {
        super.onFinish();
        startActivity(new Intent(mContext, MainActivity.class));
    }

}