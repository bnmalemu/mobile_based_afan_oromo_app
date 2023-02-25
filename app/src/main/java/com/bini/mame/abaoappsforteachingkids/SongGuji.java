package com.bini.mame.abaoappsforteachingkids;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by Mame on 3/20/2016.
 */
public class SongGuji extends AppCompatActivity
{
    ProgressDialog dialog;

    VideoView video;

    String VideoURL = "android.resource://com.bini.mame.abaoappsforteachingkids/"+R.raw.guji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sirba_guji);

        video = (VideoView) findViewById(R.id.guv);

        dialog = new ProgressDialog(SongGuji.this);

        dialog.setTitle("VIIDIYOO DAAWWACHUUN");

        dialog.setMessage("BARBAADAA JIRA...");

        dialog.setCancelable(false);

        dialog.setIndeterminate(false);

        dialog.show();
        //video.start();

        try {

            MediaController controller = new MediaController(SongGuji.this);

            Uri player = Uri.parse(VideoURL);

            controller.setAnchorView(video);

            video.setMediaController(controller);

            video.setVideoURI(player);


        } catch (Exception e) {

            Log.e("ERROR", e.getMessage());

            e.printStackTrace();

        }

        video.requestFocus();

        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {

                dialog.dismiss();

                video.start();


            }
        });

    }
}
