package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mame on 4/18/2016.
 */
public class AfanThreeResult extends AppCompatActivity
{
    private Button result1, result2, result3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_three_result);
        result1 = (Button) findViewById(R.id.nts4);
        result2 = (Button) findViewById(R.id.nts5);
        result3 = (Button) findViewById(R.id.nts6);
        result1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(getApplicationContext(), AfanThreeResultOne.class);
                startActivity(one);
            }
        });
        result2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(getApplicationContext(), AfanThreeResultTwo.class);
                startActivity(one);
            }
        });
        result3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(getApplicationContext(), AfanThreeResultThree.class);
                startActivity(one);
            }
        });
    }
}
