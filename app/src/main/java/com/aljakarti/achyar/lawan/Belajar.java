package com.aljakarti.achyar.lawan;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Belajar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onStart() {
        super.onStart();

        final ImageView tumbuhan = (ImageView) findViewById(R.id.tumbuhan);
        tumbuhan.getDrawable().setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
        tumbuhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tumbuhan.getDrawable().setColorFilter(0xFF669900, PorterDuff.Mode.MULTIPLY);
                Intent tumbuhan = new Intent(getApplication(),PemakanTumbuhan.class);
                startActivity(tumbuhan);
            }
        });

        final ImageView daging = (ImageView) findViewById(R.id.daging);
        daging.getDrawable().setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
        daging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daging.getDrawable().setColorFilter(0xFFCC0000, PorterDuff.Mode.MULTIPLY);
                Intent daging= new Intent(getApplication(),PemakanDaging.class);
                startActivity(daging);
            }
        });

        final ImageView serangga = (ImageView) findViewById(R.id.serangga);
        serangga.getDrawable().setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
        serangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                serangga.getDrawable().setColorFilter(0xFFFF8800, PorterDuff.Mode.MULTIPLY);
                Intent serangga = new Intent(getApplication(),PemakanSerangga.class);
                startActivity(serangga);
            }
        });

        final ImageView segalanya = (ImageView) findViewById(R.id.segalanya);
        segalanya.getDrawable().setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
        segalanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                segalanya.getDrawable().setColorFilter(0xFF33B5E5, PorterDuff.Mode.MULTIPLY);
                Intent segalanya = new Intent(getApplication(),PemakanSegalanya.class);
                startActivity(segalanya);
            }
        });
    }
}
