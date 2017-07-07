package com.aljakarti.achyar.lawan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by achyar on 6/7/2017.
 */

public class GridAdapterH extends BaseAdapter {

    private Context context;
    private String[] nHewan;
    private Integer[] gHewan;
    private LayoutInflater inflater;

    public GridAdapterH(Context context, String[] nHewan, Integer[] gHewan){
        this.context = context;
        this.nHewan = nHewan;
        this.gHewan = gHewan;
    }


    @Override
    public int getCount() {
        return nHewan.length;
    }

    @Override
    public Object getItem(int position) {
        return nHewan[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View gridView = convertView;

        if(convertView == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_layouth, null );
        }

        ImageView imageView = (ImageView) gridView.findViewById(R.id.gambarHewan);
        TextView textView = (TextView) gridView.findViewById(R.id.namaHewan);

        imageView.setImageResource(gHewan[position]);
        textView.setText(nHewan[position]);

        return gridView;
    }
}
