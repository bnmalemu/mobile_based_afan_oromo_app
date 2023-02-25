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
public class EngTwoTestTwo extends AppCompatActivity
{
    private Button ques;
    private RadioGroup group;
    private RadioButton rba, rbb, rbc;
    private Button next;
    private final int[] question = {R.raw.bb, R.raw.cc, R.raw.dd, R.raw.ff, R.raw.gg, R.raw.hh, R.raw.jj, R.raw.kk, R.raw.ll, R.raw.mm, R.raw.nn,
            R.raw.pp, R.raw.qq, R.raw.rr, R.raw.ss, R.raw.tt, R.raw.vv, R.raw.ww, R.raw.xx, R.raw.yy, R.raw.zz};
    private String [] answer = {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
    private String [][] option = {{"A", "C", "B"}, {"C", "R", "D"}, {"D", "F", "A"}, {"F", "E", "G"}, {"G", "D", "C"}, {"H", "I", "S"},
            {"R", "E", "J"}, {"T", "H", "K"}, {"S", "L", "K"}, {"P", "M", "L"}, {"W", "O", "N"},
            {"A", "C", "P"}, {"Q", "J", "R"}, {"R", "N", "M"}, {"A", "S", "T"}, {"M", "P", "T"},
            {"r", "e", "g"}, {"q", "h", "u"}, {"s", "q", "k"}, {"p", "u", "l"}, {"w", "o", "x"},
            {"Z", "V", "G"}, {"Q", "W", "X"}, {"S", "X", "K"}, {"H", "Y", "L"}, {"Z", "O", "R"}};
    private MediaPlayer mp;
    public static int correct, wrong, point, inexact;
    private int flag = 0;
    private HashMap list = new HashMap<Integer, String>();

    String ch[];
    String answ;
    public static String DARO2;
    private String MARKS;
    private String NAMES;
    private final Context cxt2 = this;
    //int index;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eng_two_ques_two);

        // variable initialization

        ques = (Button) findViewById(R.id.bny12);
        group = (RadioGroup) findViewById(R.id.bnp12);
        rba = (RadioButton) findViewById(R.id.bna12);
        rbb = (RadioButton) findViewById(R.id.bnb12);
        rbc = (RadioButton) findViewById(R.id.bnc12);
        next = (Button) findViewById(R.id.bnn12);

        flag = (int)Math.floor((Math.random() * 21));
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
                flag = (int) (Math.random() * 21);
                while(list.containsKey(flag)) {
                    flag = (int)Math.floor((Math.random() * 21));
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
                    DARO2 = EngTwoTest.DARO;
                    NAMES = DARO2;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String DATE = dateFormat.format(date);
                    Log.d("MAQAA IS", "" +NAMES );
                    Log.d("QABXII IS", "" +correct );
                    Log.d("CURRENT DATE", "TODAY IS" +DATE);
                    MARKS = String.valueOf(correct);
                    EngTwoDatabaseTwo bini = new EngTwoDatabaseTwo(cxt2);
                    bini.saveEng22(bini, NAMES, MARKS, DATE);
                    Toast.makeText(getApplicationContext(), "BAGA GAMMADDE HAALA GAARIIN QABXIIN KEE KUUFAMEERA", Toast.LENGTH_LONG).show();
                    finish();
                }
                if (list.size() >= question.length) {
                    Intent intent = new Intent(EngTwoTestTwo.this, EngTwoCorrectionTwo.class);
                    startActivity(intent);
                }
            }
        });
    }
}
