package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mame on 5/11/2016.
 */
public class EngTwoCorrectionOne extends AppCompatActivity
{
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_two_test_one_correct);
        result = (TextView) findViewById(R.id.bal1);
        StringBuffer buffer = new StringBuffer();
        buffer.append("QABXII ARGATTE = " + EngTwoTestOne.correct + "\n\n");
        buffer.append("DEEBII DOGOGGORAA = " + EngTwoTestOne.wrong + "\n\n");
        result.setText(buffer);
    }
}
