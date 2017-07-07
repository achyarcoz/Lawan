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

public class PemakanSegalanya extends AppCompatActivity {

    GridView gridView;

    Integer[] gHewan = {
            R.drawable.oayam1,
            R.drawable.obabi1,
            R.drawable.obebek1,
            R.drawable.oburungmerak1,
            R.drawable.ogorila1,
            R.drawable.olemur1,
            R.drawable.omonyet1,
            R.drawable.orakun1,
            R.drawable.otikus1,
            R.drawable.otupai1,
    };

    String[] nHewan = {
            "AYAM",
            "BABI",
            "BEBEK",
            "BURUNG MERAK",
            "GORILA",
            "LEMUR",
            "MONYET",
            "RAKUN",
            "TIKUS",
            "TUPAI",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemakan_segalanya);
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

        gridView = (GridView) findViewById(R.id.gridSegalanya);

        GridAdapterO adapter = new GridAdapterO(PemakanSegalanya.this,nHewan,gHewan);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(PemakanSegalanya.this,""+nHewan[position],Toast.LENGTH_SHORT).show();

                switch (position){
                    case 0:
                        MediaPlayer mpayam = MediaPlayer.create(PemakanSegalanya.this, R.raw.suaraayam);
                        mpayam.start();
                        Intent oayam = new Intent(getApplication(),OAyam.class);
                        startActivity(oayam);
                        break;

                    case 1:
                        MediaPlayer mpbabi = MediaPlayer.create(PemakanSegalanya.this, R.raw.suarababi);
                        mpbabi.start();
                        Intent obabi = new Intent(getApplication(),OBabi.class);
                        startActivity(obabi);
                        break;

                    case 2:
                        MediaPlayer mpbebek = MediaPlayer.create(PemakanSegalanya.this, R.raw.suarabebek);
                        mpbebek.start();
                        Intent obebek = new Intent(getApplication(),OBebek.class);
                        startActivity(obebek);
                        break;

                    case 3:
                        MediaPlayer mpburungmerak = MediaPlayer.create(PemakanSegalanya.this, R.raw.suaraburungmerak);
                        mpburungmerak.start();
                        Intent oburungmerak = new Intent(getApplication(),OBurungMerak.class);
                        startActivity(oburungmerak);
                        break;

                    case 4:
                        MediaPlayer mpgorila = MediaPlayer.create(PemakanSegalanya.this, R.raw.suaragorila);
                        mpgorila.start();
                        Intent ogorila = new Intent(getApplication(),OGorila.class);
                        startActivity(ogorila);
                        break;

                    case 5:
                        MediaPlayer mplemur = MediaPlayer.create(PemakanSegalanya.this, R.raw.suaralemur);
                        mplemur.start();
                        Intent olemur = new Intent(getApplication(),OLemur.class);
                        startActivity(olemur);
                        break;

                    case 6:
                        MediaPlayer mpmonyet = MediaPlayer.create(PemakanSegalanya.this, R.raw.suaramonyet);
                        mpmonyet.start();
                        Intent omonyet = new Intent(getApplication(),OMonyet.class);
                        startActivity(omonyet);
                        break;

                    case 7:
                        MediaPlayer mprakun = MediaPlayer.create(PemakanSegalanya.this, R.raw.suararakun);
                        mprakun.start();
                        Intent orakun = new Intent(getApplication(),ORakun.class);
                        startActivity(orakun);
                        break;

                    case 8:
                        MediaPlayer mptikus = MediaPlayer.create(PemakanSegalanya.this, R.raw.suaratikus);
                        mptikus.start();
                        Intent otikus = new Intent(getApplication(),OTikus.class);
                        startActivity(otikus);
                        break;

                    case 9:
                        MediaPlayer mptupai = MediaPlayer.create(PemakanSegalanya.this, R.raw.suaratupai);
                        mptupai.start();
                        Intent otupai = new Intent(getApplication(),OTupai.class);
                        startActivity(otupai);
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
