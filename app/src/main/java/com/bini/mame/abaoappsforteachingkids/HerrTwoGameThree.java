package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mame on 5/29/2016.
 */
public class HerrTwoGameThree extends AppCompatActivity
{
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_two_game_three);
        button = (Button) findViewById(R.id.tap8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bnma = new Intent(getApplicationContext(), HerrThreeDragAndDropTwo.class);
                startActivity(bnma);
            }
        });
    }
}
