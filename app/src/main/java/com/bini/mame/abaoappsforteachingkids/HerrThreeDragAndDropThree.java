package com.bini.mame.abaoappsforteachingkids;

import android.content.ClipData;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Mame on 5/29/2016.
 */
public class HerrThreeDragAndDropThree extends AppCompatActivity
{
    private TextView a, b, c, d, e, f;
    private Button a11, b11, c11, d11, e11, f11;
    private MediaPlayer bini, singing;
    private TextView draggeda, draggedb, draggedc, draggedd, draggede, draggedf;
    private Button droppeda, droppedb, droppedc, droppedd, droppede, droppedf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herr_three_drag_three);
        a = (TextView) findViewById(R.id.chp);
        b = (TextView) findViewById(R.id.dhp);
        c = (TextView) findViewById(R.id.nyp);
        d = (TextView) findViewById(R.id.php);
        e = (TextView) findViewById(R.id.shp);
        f = (TextView) findViewById(R.id.tsp);

        a11 = (Button) findViewById(R.id.jar12);
        b11 = (Button) findViewById(R.id.jar22);
        c11 = (Button) findViewById(R.id.jar32);
        d11 = (Button) findViewById(R.id.jar42);
        e11 = (Button) findViewById(R.id.jar52);
        f11 = (Button) findViewById(R.id.jar62);

        a.setOnLongClickListener(dragging);
        b.setOnLongClickListener(dragging);
        c.setOnLongClickListener(dragging);
        d.setOnLongClickListener(dragging);
        e.setOnLongClickListener(dragging);
        f.setOnLongClickListener(dragging);

        a11.setOnDragListener(droppinga);
        b11.setOnDragListener(droppingb);
        c11.setOnDragListener(droppingc);
        d11.setOnDragListener(droppingd);
        e11.setOnDragListener(droppinge);
        f11.setOnDragListener(droppingf);
        a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bini = MediaPlayer.create(getApplicationContext(), R.raw.dhisoddoma);
                bini.start();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bini = MediaPlayer.create(getApplicationContext(), R.raw.tojaa);
                bini.start();
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bini = MediaPlayer.create(getApplicationContext(), R.raw.dhijaatama);
                bini.start();
            }
        });
        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bini = MediaPlayer.create(getApplicationContext(), R.raw.dhishantama);
                bini.start();
            }
        });
        e11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bini = MediaPlayer.create(getApplicationContext(), R.raw.jasaddet);
                bini.start();
            }
        });
        f11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bini = MediaPlayer.create(getApplicationContext(), R.raw.shasagal);
                bini.start();
            }
        });
    }
    View.OnLongClickListener dragging = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            DragShadow dragShadow = new DragShadow(v);
            ClipData data = ClipData.newPlainText("", "");
            v.startDrag(data, dragShadow, v, 0);
            return false;
        }
    };
    private class DragShadow extends View.DragShadowBuilder
    {
        ColorDrawable biniam;

        public DragShadow(View view)
        {
            super(view);
            biniam = new ColorDrawable(Color.LTGRAY);
        }
        @Override
        public void onDrawShadow(Canvas canvas)
        {
            biniam.draw(canvas);
        }

        @Override
        public void onProvideShadowMetrics(Point shadowSize, Point shadowTouchPoint)
        {
            View v = getView();
            int width = v.getWidth();
            int height = v.getHeight();
            biniam.setBounds(0, 0, width, height);
            shadowSize.set(width, height);
            shadowTouchPoint.set(width, height);
        }
    }
    View.OnDragListener droppinga = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    String abc, def;
                    TextView bnman = new TextView(getApplicationContext());
                    bnman.setText(R.string.bm34);
                    abc=bnman.getText().toString();
                    draggeda = (TextView) event.getLocalState();
                    def=draggeda.getText().toString();
                    if(abc.equals(def)) {
                        droppeda = (Button) v;
                        droppeda.setText(draggeda.getText());
                        a.setText("");
                    }
                    else
                    {
                        singing = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        singing.start();
                        Toast.makeText(getApplicationContext(), "SIRRII MITI IRRA DEEBI'II YAALI", Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppingb = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    String ghi, jkl;
                    TextView bnman = new TextView(getApplicationContext());
                    bnman.setText(R.string.bm33);
                    ghi=bnman.getText().toString();
                    draggedb = (TextView) event.getLocalState();
                    jkl=draggedb.getText().toString();
                    if(ghi.equals(jkl)) {
                        droppedb = (Button) v;
                        droppedb.setText(draggedb.getText());
                        b.setText("");
                    }
                    else
                    {
                        singing = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        singing.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppingc = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    String abc, def;
                    TextView bnman = new TextView(getApplicationContext());
                    bnman.setText(R.string.bm36);
                    abc=bnman.getText().toString();
                    draggedc = (TextView) event.getLocalState();
                    def=draggedc.getText().toString();
                    if(abc.equals(def)) {
                        droppedc = (Button) v;
                        droppedc.setText(draggedc.getText());
                        c.setText("");
                    }
                    else
                    {
                        singing = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        singing.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppingd = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    String ghi, jkl;
                    TextView bnman = new TextView(getApplicationContext());
                    bnman.setText(R.string.bm35);
                    ghi=bnman.getText().toString();
                    draggedd = (TextView) event.getLocalState();
                    jkl=draggedd.getText().toString();
                    if(ghi.equals(jkl)) {
                        droppedd = (Button) v;
                        droppedd.setText(draggedd.getText());
                        d.setText("");
                    }
                    else
                    {
                        singing = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        singing.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppinge = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    String abc, def;
                    TextView bnman = new TextView(getApplicationContext());
                    bnman.setText(R.string.bm32);
                    abc=bnman.getText().toString();
                    draggede = (TextView) event.getLocalState();
                    def=draggede.getText().toString();
                    if(abc.equals(def)) {
                        droppede = (Button) v;
                        droppede.setText(draggede.getText());
                        e.setText("");
                    }
                    else
                    {
                        singing = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        singing.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
    View.OnDragListener droppingf = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    String abc, def;
                    TextView bnman = new TextView(getApplicationContext());
                    bnman.setText(R.string.bm31);
                    abc=bnman.getText().toString();
                    draggedf = (TextView) event.getLocalState();
                    def=draggedf.getText().toString();
                    if(abc.equals(def)) {
                        droppedf = (Button) v;
                        droppedf.setText(draggedf.getText());
                        f.setText("");
                    }
                    else
                    {
                        singing = MediaPlayer.create(getApplicationContext(), R.raw.miti);
                        singing.start();
                        Toast.makeText(getApplicationContext(),"SIRRII MITI IRRA DEEBI'II YAALI",Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            return true;
        }
    };
}
