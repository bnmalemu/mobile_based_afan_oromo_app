package com.bini.mame.abaoappsforteachingkids;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 4/18/2016.
 */
public class HerrOneGame extends TabActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_host_activity);

        // create the TabHost that will contain the Tabs


        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

        TabHost.TabSpec tab1 = tabHost.newTabSpec("FIRST TAB");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("SECOND TAB");

        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected

        tab1.setIndicator("TAPHA 1FFAA");
        tab1.setContent(new Intent(this, HerrOneAnimOne.class));

        tab2.setIndicator("TAPHA 2FAA");
        tab2.setContent(new Intent(this, HerrOneGameTwo.class));

        /** Add the tabs  to the TabHost to display. */

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
    }
}
