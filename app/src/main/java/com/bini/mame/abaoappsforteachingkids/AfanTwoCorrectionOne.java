package com.bini.mame.abaoappsforteachingkids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mame on 5/11/2016.
 */
public class AfanTwoCorrectionOne extends AppCompatActivity
{
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afan_two_test_one_correct);
        result = (TextView) findViewById(R.id.dat1);
        StringBuffer buffer = new StringBuffer();
        buffer.append("QABXII ARGATTE = " + AfanTwoTestOne.correct + "\n\n");
        buffer.append("DEEBII DOGOGGORAA = " + AfanTwoTestOne.wrong + "\n\n");
        result.setText(buffer);
    }
}
