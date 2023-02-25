package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
/**
 * Created by Mame on 4/18/2016.
 */
public class AfanOneAnimC extends AppCompatActivity
{
    ImageView cee;
    private MediaPlayer rihana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aaaac);

        cee = (ImageView) findViewById(R.id.aac);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.one_letter_anim_one);
        cee.setAnimation(animation);

        // implement listener to this animation activity

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                rihana = MediaPlayer.create(getApplicationContext(), R.raw.c);
                rihana.start();
            }

            @Override
            public void onAnimationEnd(Animation animation) {

                finish();
                startActivity(new Intent(getApplicationContext(), AfanOneAnimD.class));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
