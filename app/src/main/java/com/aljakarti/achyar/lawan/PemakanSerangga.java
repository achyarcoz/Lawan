package com.aljakarti.achyar.lawan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class PemakanSerangga extends AppCompatActivity {

    GridView gridView;

    Integer[] gHewan = {
            R.drawable.icicak1,
            R.drawable.ikatak1,
            R.drawable.itokek1,
            R.drawable.iularderik1,
    };

    String[] nHewan = {
            "CICAK",
            "KATAK",
            "TOKEK",
            "ULAR DERIK",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemakan_serangga);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        gridView = (GridView) findViewById(R.id.gridSerangga);

        GridAdapterI adapter = new GridAdapterI(PemakanSerangga.this,nHewan,gHewan);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(PemakanSerangga.this,""+nHewan[position],Toast.LENGTH_SHORT).show();

                switch (position){
                    case 0:
                        MediaPlayer mpcicak = MediaPlayer.create(PemakanSerangga.this, R.raw.suaracicak);
                        mpcicak.start();
                        Intent icicak = new Intent(getApplication(),ICicak.class);
                        startActivity(icicak);
                        break;

                    case 1:
                        MediaPlayer mpkatak = MediaPlayer.create(PemakanSerangga.this, R.raw.suarakatak);
                        mpkatak.start();
                        Intent ikatak = new Intent(getApplication(),IKatak.class);
                        startActivity(ikatak);
                        break;

                    case 2:
                        MediaPlayer mptokek = MediaPlayer.create(PemakanSerangga.this, R.raw.suaratokek);
                        mptokek.start();
                        Intent itokek = new Intent(getApplication(),ITokek.class);
                        startActivity(itokek);
                        break;

                    case 3:
                        MediaPlayer mpularderik = MediaPlayer.create(PemakanSerangga.this, R.raw.suaraularderik);
                        mpularderik.start();
                        Intent iularderik = new Intent(getApplication(),IUlarDerik.class);
                        startActivity(iularderik);
                        break;
                }
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
