package com.bini.mame.abaoappsforteachingkids;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Mame on 3/20/2016.
 */
public class WearShaw extends AppCompatActivity
{
    ViewPager viewPager;
    UfataShawa adapterOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager_main);

        viewPager = (ViewPager) findViewById(R.id.vp1);
        adapterOne = new UfataShawa(this);
        viewPager.setAdapter(adapterOne);

    }
}
