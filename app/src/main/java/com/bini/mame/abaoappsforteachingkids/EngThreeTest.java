package com.bini.mame.abaoappsforteachingkids;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Mame on 5/11/2016.
 */
public class EngThreeTest extends TabActivity
{
    public static String JIMMA1;
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
        TabHost.TabSpec tab3 = tabHost.newTabSpec("THIRD TAB TAB");

        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected

        tab1.setIndicator("1ST TEST");
        tab1.setContent(new Intent(this, EngThreeTestOne.class));
        JIMMA1 = EvaluationThree.COMPUTER;

        tab2.setIndicator("2ND TEST");
        tab2.setContent(new Intent(this, EngThreeTestTwo.class));
        JIMMA1 = EvaluationThree.COMPUTER;

        tab3.setIndicator("3RD TEST");
        tab3.setContent(new Intent(this, EngThreeTestThree.class));
        JIMMA1 = EvaluationThree.COMPUTER;

        /** Add the tabs  to the TabHost to display. */

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
    }
}
