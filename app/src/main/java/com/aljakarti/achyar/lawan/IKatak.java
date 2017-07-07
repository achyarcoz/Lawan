package com.aljakarti.achyar.lawan;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoViewAttacher;

public class IKatak extends AppCompatActivity {
    ViewPager viewPager;
    CustomSwip customSwip;
    ImageView imageView;
    private Integer[] imageresource ={
            R.drawable.ikatak2,
            R.drawable.ikatak3,
            R.drawable.ikatak4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundResource(android.R.color.holo_orange_dark);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(android.R.drawable.ic_menu_close_clear_cancel);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(IKatak.this, R.raw.suarakatak);
                mp.start();
            }
        });

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        customSwip = new CustomSwip(this);
        viewPager.setAdapter(customSwip);
    }

    @Override
    protected void onStart() {
        super.onStart();
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewPager.LayoutParams.WRAP_CONTENT,
                ViewPager.LayoutParams.WRAP_CONTENT,
                1f);
        params.setMargins(2,0,2,0);

        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setText("K");
        text1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
        text1.setBackgroundResource(android.R.color.holo_blue_dark);
        text1.setLayoutParams(params);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(IKatak.this, R.raw.k);
                mp.start();
            }
        });

        TextView text2 = (TextView) findViewById(R.id.text2);
        text2.setText("A");
        text2.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
        text2.setBackgroundResource(android.R.color.holo_blue_dark);
        text2.setLayoutParams(params);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(IKatak.this, R.raw.a);
                mp.start();
            }
        });

        TextView text3 = (TextView) findViewById(R.id.text3);
        text3.setText("T");
        text3.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
        text3.setBackgroundResource(android.R.color.holo_blue_dark);
        text3.setLayoutParams(params);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(IKatak.this, R.raw.t);
                mp.start();
            }
        });

        TextView text4 = (TextView) findViewById(R.id.text4);
        text4.setText("A");
        text4.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
        text4.setBackgroundResource(android.R.color.holo_blue_dark);
        text4.setLayoutParams(params);
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(IKatak.this, R.raw.a);
                mp.start();
            }
        });

        TextView text5 = (TextView) findViewById(R.id.text5);
        text5.setText("K");
        text5.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
        text5.setBackgroundResource(android.R.color.holo_blue_dark);
        text5.setLayoutParams(params);
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(IKatak.this, R.raw.k);
                mp.start();
            }
        });

        ImageView playNama = (ImageView) findViewById(R.id.playNama);
        playNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(IKatak.this, R.raw.abjadkatak);
                mp.start();
            }
        });

    }

    //Image slidder
    public class CustomSwip extends PagerAdapter {

        private Context context;
        private LayoutInflater layoutInflater;

        public CustomSwip(Context c)
        {
            context = c;
        }

        @Override
        public int getCount() {

            return imageresource.length ;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View itemView = layoutInflater.inflate(R.layout.custom_swip,container,false);
            imageView = (ImageView) itemView.findViewById(R.id.swipImageView);
            imageView.setImageResource(imageresource[position]);
            ImageView satu = (ImageView) itemView.findViewById(R.id.satu);
            ImageView dua = (ImageView) itemView.findViewById(R.id.dua);
            ImageView tiga = (ImageView) itemView.findViewById(R.id.tiga);

            PhotoViewAttacher photoViewAttacher = new PhotoViewAttacher(imageView);
            photoViewAttacher.update();

            switch (position){
                case 0 :
                    satu.setImageResource(android.R.drawable.presence_online);
                    dua.setImageResource(android.R.drawable.presence_invisible);
                    tiga.setImageResource(android.R.drawable.presence_invisible);
                    break;
                case 1 :
                    satu.setImageResource(android.R.drawable.presence_invisible);
                    dua.setImageResource(android.R.drawable.presence_online);
                    tiga.setImageResource(android.R.drawable.presence_invisible);
                    break;
                case 2 :
                    satu.setImageResource(android.R.drawable.presence_invisible);
                    dua.setImageResource(android.R.drawable.presence_invisible);
                    tiga.setImageResource(android.R.drawable.presence_online);
                    break;
            }
            container.addView(itemView);
            return itemView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {

        }

        @Override
        public boolean isViewFromObject(View view, Object object) {

            return (view==object);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}


