package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Mame on 4/19/2016.
 */
public class EngOneAnimE extends AppCompatActivity
{
    ImageView bini;
    private MediaPlayer rihana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bbbbe);

        bini = (ImageView) findViewById(R.id.bbe);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.one_letter_anim_one);
        bini.setAnimation(animation);

        // implement listener to this animation activity

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                rihana = MediaPlayer.create(getApplicationContext(), R.raw.ee);
                rihana.start();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                startActivity(new Intent(getApplicationContext(), EngOneAnimF.class));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
