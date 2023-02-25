package com.bini.mame.abaoappsforteachingkids;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Mame on 5/11/2016.
 */
public class EngTwoTestOne extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final int[] question = {R.raw.aa, R.raw.ee, R.raw.ii, R.raw.oo, R.raw.uu, R.raw.aa};
    private String [] answer = {"A", "E", "I", "O", "U", "A"};
    private String [][] option = {{"A", "C", "B"}, {"E", "N", "M"}, {"I", "J", "S"}, {"D", "O", "M"}, {"A", "Y", "U"}, {"A", "Y", "U"}};
    private MediaPlayer mp;
    public static int correct, wrong, point, inexact;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    String ch[];
    String answ;
    public static String DARO1;
    private String MARKS;
    private String NAMES;
    private final Context cxt1 = this;

    //int index;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_two_ques_one);

        // variable initialization

        ques = (Button) findViewById(R.id.bny11);
        group = (RadioGroup) findViewById(R.id.bnp11);
        rba = (RadioButton) findViewById(R.id.bna11);
        rbb = (RadioButton) findViewById(R.id.bnb11);
        rbc = (RadioButton) findViewById(R.id.bnc11);
        next = (Button) findViewById(R.id.bnn11);

        flag = (int)Math.floor((Math.random() * 6));
        list.put(flag, "");

        ch = option[flag];
        answ = answer[flag];
        Log.d("Index: ", "" + flag);

        ques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getApplicationContext(), question[flag]);
                mp.start();
            }
        });

        ques.setText(question[flag]);
        rba.setText(ch[0]);
        rbb.setText(ch[1]);
        rbc.setText(ch[2]);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton ans = (RadioButton) findViewById(group.getCheckedRadioButtonId());
                String deebii = ans.getText().toString();

                if (deebii.equalsIgnoreCase(answ)) {
                    correct++;
                }
                else{
                    wrong++;
                }
                flag = (int) (Math.random() * 6);
                while(list.containsKey(flag)) {
                    flag = (int)Math.floor((Math.random() * 6));
                }
                list.put(flag, "");

                ch = option[flag];
                answ = answer[flag];
                Log.d("Index: ", "" + flag);

                if (flag < question.length) {
                    ques.setText(question[flag]);
                    mp = MediaPlayer.create(getApplicationContext(), question[flag]);
                    mp.start();
                    rba.setText(ch[0]);
                    rbb.setText(ch[1]);
                    rbc.setText(ch[2]);
                }
                if (list.size() == question.length){
                    DARO1 = EngTwoTest.DARO;
                    NAMES = DARO1;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    EngTwoDatabaseOne bini = new EngTwoDatabaseOne(cxt1);
                    bini.saveEng21(bini, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(EngTwoTestOne.this, EngTwoCorrectionOne.class);
                    startActivity(intent);
                }
            }
        });
    }
}
