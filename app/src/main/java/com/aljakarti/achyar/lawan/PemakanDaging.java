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

public class PemakanDaging extends AppCompatActivity {

    GridView gridView;
    Integer[] gHewan = {
            R.drawable.kanjing1,
            R.drawable.kanjinglaut1,
            R.drawable.kberuang1,
            R.drawable.kbuaya1,
            R.drawable.kburungbangkai1,
            R.drawable.kburungelang1,
            R.drawable.kburunggagak1,
            R.drawable.kburunghantu1,
            R.drawable.kgajahlaut1,
            R.drawable.khyena1,
            R.drawable.kjaguar1,
            R.drawable.klumbalumba1,
            R.drawable.klynx1,
            R.drawable.kpanther1,
            R.drawable.kpaus1,
            R.drawable.kpinguin1,
            R.drawable.kpuma1,
            R.drawable.kserigala1,
            R.drawable.ksinga1,
            R.drawable.kular1,
    };

    String[] nHewan={
            "ANJING",
            "ANJING LAUT",
            "BERUANG",
            "BUAYA",
            "BURUNG BANGKAI",
            "BURUNG ELANG",
            "BURUNG GAGAK",
            "BURUNG HANTU",
            "GAJAH LAUT",
            "HYENA",
            "JAGUAR",
            "LUMBA-LUMBA",
            "LYNX",
            "PANTHER",
            "PAUS",
            "PINGUIN",
            "PUMA",
            "SERIGALA",
            "SINGA",
            "ULAR",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemakan_daging);
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

        gridView = (GridView) findViewById(R.id.gridDaging);

        GridAdapterK adapter = new GridAdapterK(PemakanDaging.this,nHewan,gHewan);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(PemakanDaging.this,""+nHewan[position],Toast.LENGTH_SHORT).show();

                switch (position){
                    case 0:
                        MediaPlayer mpanjing = MediaPlayer.create(PemakanDaging.this, R.raw.suaraanjing);
                        mpanjing.start();
                        Intent kanjing = new Intent(getApplication(),KAnjing.class);
                        startActivity(kanjing);
                        break;
                    case 1:
                        MediaPlayer mpanjinglaut = MediaPlayer.create(PemakanDaging.this, R.raw.suaraanjinglaut);
                        mpanjinglaut.start();
                        Intent kanjinglaut = new Intent(getApplication(),KAnjingLaut.class);
                        startActivity(kanjinglaut);
                        break;
                    case 2:
                        MediaPlayer mpberuang = MediaPlayer.create(PemakanDaging.this, R.raw.suaraberuang);
                        mpberuang.start();
                        Intent kberuang = new Intent(getApplication(),KBeruang.class);
                        startActivity(kberuang);
                        break;
                    case 3:
                        MediaPlayer mpbuaya = MediaPlayer.create(PemakanDaging.this, R.raw.suarabuaya);
                        mpbuaya.start();
                        Intent kbuaya = new Intent(getApplication(),KBuaya.class);
                        startActivity(kbuaya);
                        break;
                    case 4:
                        MediaPlayer mpburungbangkai = MediaPlayer.create(PemakanDaging.this, R.raw.suaraburungbangkai);
                        mpburungbangkai.start();
                        Intent kburungbangkai = new Intent(getApplication(),KBurungBangkai.class);
                        startActivity(kburungbangkai);
                        break;
                    case 5:
                        MediaPlayer mpburungelang = MediaPlayer.create(PemakanDaging.this, R.raw.suaraburungelang);
                        mpburungelang.start();
                        Intent kburungelang = new Intent(getApplication(),KBurungElang.class);
                        startActivity(kburungelang);
                        break;
                    case 6:
                        MediaPlayer mpburunggagak = MediaPlayer.create(PemakanDaging.this, R.raw.suaraburunggagak);
                        mpburunggagak.start();
                        Intent kburunggagak = new Intent(getApplication(),KBurungGagak.class);
                        startActivity(kburunggagak);
                        break;
                    case 7:
                        MediaPlayer mpburunghantu = MediaPlayer.create(PemakanDaging.this, R.raw.suaraburunghantu);
                        mpburunghantu.start();
                        Intent kburunghantu = new Intent(getApplication(),KBurungHantu.class);
                        startActivity(kburunghantu);
                        break;
                    case 8:
                        MediaPlayer mpgajahlaut = MediaPlayer.create(PemakanDaging.this, R.raw.suaragajahlaut);
                        mpgajahlaut.start();
                        Intent kgajahlaut = new Intent(getApplication(),KGajahLaut.class);
                        startActivity(kgajahlaut);
                        break;
                    case 9:
                        MediaPlayer mphyena= MediaPlayer.create(PemakanDaging.this, R.raw.suarahyena);
                        mphyena.start();
                        Intent khyena= new Intent(getApplication(),KHyena.class);
                        startActivity(khyena);
                        break;
                    case 10:
                        MediaPlayer mpjaguar = MediaPlayer.create(PemakanDaging.this, R.raw.suarajaguar);
                        mpjaguar.start();
                        Intent kjaguar = new Intent(getApplication(),KJaguar.class);
                        startActivity(kjaguar);
                        break;
                    case 11:
                        MediaPlayer mplumbalumba = MediaPlayer.create(PemakanDaging.this, R.raw.suaralumbalumba);
                        mplumbalumba.start();
                        Intent klumbalumba= new Intent(getApplication(),KLumbaLumba.class);
                        startActivity(klumbalumba);
                        break;
                    case 12:
                        MediaPlayer mplynx = MediaPlayer.create(PemakanDaging.this, R.raw.suaralynx);
                        mplynx.start();
                        Intent klynx = new Intent(getApplication(),KLynx.class);
                        startActivity(klynx);
                        break;
                    case 13:
                        MediaPlayer mppanther = MediaPlayer.create(PemakanDaging.this, R.raw.suarapanther);
                        mppanther.start();
                        Intent kpanther = new Intent(getApplication(),KPanther.class);
                        startActivity(kpanther);
                        break;
                    case 14:
                        MediaPlayer mppaus = MediaPlayer.create(PemakanDaging.this, R.raw.suarapaus);
                        mppaus.start();
                        Intent kpaus = new Intent(getApplication(),KPaus.class);
                        startActivity(kpaus);
                        break;
                    case 15:
                        MediaPlayer mppinguin = MediaPlayer.create(PemakanDaging.this, R.raw.suarapinguin);
                        mppinguin.start();
                        Intent kpinguin = new Intent(getApplication(),KPinguin.class);
                        startActivity(kpinguin);
                        break;
                    case 16:
                        MediaPlayer mppuma = MediaPlayer.create(PemakanDaging.this, R.raw.suarapuma);
                        mppuma.start();
                        Intent kpuma = new Intent(getApplication(),KPuma.class);
                        startActivity(kpuma);
                        break;
                    case 17:
                        MediaPlayer mpserigala = MediaPlayer.create(PemakanDaging.this, R.raw.suaraserigala);
                        mpserigala.start();
                        Intent kserigala = new Intent(getApplication(),KSerigala.class);
                        startActivity(kserigala);
                        break;
                    case 18:
                        MediaPlayer mpsinga = MediaPlayer.create(PemakanDaging.this, R.raw.suarasinga);
                        mpsinga.start();
                        Intent ksinga = new Intent(getApplication(),KSinga.class);
                        startActivity(ksinga);
                        break;
                    case 19:
                        MediaPlayer mpular = MediaPlayer.create(PemakanDaging.this, R.raw.suaraular);
                        mpular.start();
                        Intent kular = new Intent(getApplication(),KUlar.class);
                        startActivity(kular);
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
