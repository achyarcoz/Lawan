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

public class PemakanTumbuhan extends AppCompatActivity {

    GridView gridView ;
    Integer[] gHewan = {
            R.drawable.hangsa1,
            R.drawable.hbadak1,
            R.drawable.hburungkardinal1,
            R.drawable.hburungkenari1,
            R.drawable.hburungpipit1,
            R.drawable.hgajah1,
            R.drawable.hkambing1,
            R.drawable.hkoala1,
            R.drawable.hkuda1,
            R.drawable.hkudanil1,
            R.drawable.hsapi1,
            R.drawable.htikusbelanda1,
            R.drawable.hunta1,
            R.drawable.hzebra1,
    };

    String[] nHewan = {
            "ANGSA",
            "BADAK",
            "BURUNG KARDINAL",
            "BURUNG KENARI",
            "BURUNG PIPIT",
            "GAJAH",
            "KAMBING",
            "KOALA",
            "KUDA",
            "KUDA NIL",
            "SAPI",
            "TIKUS BELANDA",
            "UNTA",
            "ZEBRA",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemakan_tumbuhan);
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

        gridView = (GridView) findViewById(R.id.gridTumbuhan);

        GridAdapterH adapter = new GridAdapterH(PemakanTumbuhan.this,nHewan,gHewan);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(PemakanTumbuhan.this,""+nHewan[position],Toast.LENGTH_SHORT).show();

                switch (position){
                    case 0:
                        MediaPlayer mpangsa = MediaPlayer.create(PemakanTumbuhan.this, R.raw.suaraangsa);
                        mpangsa.start();
                        Intent hangsa = new Intent(getApplication(),HAngsa.class);
                        startActivity(hangsa);
                        break;

                    case 1:
                        MediaPlayer mpbadak = MediaPlayer.create(PemakanTumbuhan.this, R.raw.suarabadak);
                        mpbadak.start();
                        Intent hbadak = new Intent(getApplication(),HBadak.class);
                        startActivity(hbadak);
                        break;

                    case 2:
                        MediaPlayer mpkardinal = MediaPlayer.create(PemakanTumbuhan.this, R.raw.suaraburungkardinal);
                        mpkardinal.start();
                        Intent hburungkardinal = new Intent(getApplication(),HBurungKardinal.class);
                        startActivity(hburungkardinal);
                        break;

                    case 3:
                        MediaPlayer mpkenari = MediaPlayer.create(PemakanTumbuhan.this, R.raw.suaraburungkenari);
                        mpkenari.start();
                        Intent hburungkenari = new Intent(getApplication(),HBurungKenari.class);
                        startActivity(hburungkenari);
                        break;

                    case 4:
                        MediaPlayer mppipit = MediaPlayer.create(PemakanTumbuhan.this, R.raw.suaraburungpipit);
                        mppipit.start();
                        Intent hburungpipit = new Intent(getApplication(),HBurungPipit.class);
                        startActivity(hburungpipit);
                        break;

                    case 5:
                        MediaPlayer mpgajah = MediaPlayer.create(PemakanTumbuhan.this, R.raw.suaragajah);
                        mpgajah.start();
                        Intent hgajah = new Intent(getApplication(),HGajah.class);
                        startActivity(hgajah);
                        break;

                    case 6:
                        MediaPlayer mpkambing = MediaPlayer.create(PemakanTumbuhan.this, R.raw.suarakambing);
                        mpkambing.start();
                        Intent hkambing = new Intent(getApplication(),HKambing.class);
                        startActivity(hkambing);
                        break;

                    case 7:
                        MediaPlayer mpkoala = MediaPlayer.create(PemakanTumbuhan.this, R.raw.suarakoala);
                        mpkoala.start();
                        Intent hkoala = new Intent(getApplication(),HKoala.class);
                        startActivity(hkoala);
                        break;

                    case 8:
                        MediaPlayer mpkuda = MediaPlayer.create(PemakanTumbuhan.this, R.raw.suarakuda);
                        mpkuda.start();
                        Intent hkuda = new Intent(getApplication(),HKuda.class);
                        startActivity(hkuda);
                        break;

                    case 9:
                        MediaPlayer mpkudanil = MediaPlayer.create(PemakanTumbuhan.this, R.raw.suarakudanil);
                        mpkudanil.start();
                        Intent hkudanil = new Intent(getApplication(),HKudaNil.class);
                        startActivity(hkudanil);
                        break;

                    case 10:
                        MediaPlayer mpsapi = MediaPlayer.create(PemakanTumbuhan.this, R.raw.suarasapi);
                        mpsapi.start();
                        Intent hsapi = new Intent(getApplication(),HSapi.class);
                        startActivity(hsapi);
                        break;

                    case 11:
                        MediaPlayer mptikusbelanda = MediaPlayer.create(PemakanTumbuhan.this, R.raw.suaratikusbelanda);
                        mptikusbelanda.start();
                        Intent htikusbelanda = new Intent(getApplication(),HTikusBelanda.class);
                        startActivity(htikusbelanda);
                        break;

                    case 12:
                        MediaPlayer mpunta = MediaPlayer.create(PemakanTumbuhan.this, R.raw.suaraunta);
                        mpunta.start();
                        Intent hunta = new Intent(getApplication(),HUnta.class);
                        startActivity(hunta);
                        break;

                    case 13:
                        MediaPlayer mpzebra = MediaPlayer.create(PemakanTumbuhan.this, R.raw.suarazebra);
                        mpzebra.start();
                        Intent hzebra = new Intent(getApplication(),HZebra.class);
                        startActivity(hzebra);
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
