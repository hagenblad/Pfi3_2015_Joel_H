package com.example.joelhenning.assignment_4;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JoelHenning on 15-04-23.
 */
public class PlanetAdapter extends ArrayAdapter<Planet> {
    ArrayList<Planet> planetList;
    Context c;

    public PlanetAdapter (Context context, ArrayList<Planet> planetList){
        super(context, 0, planetList);
        this.planetList = planetList;
        this.c = context;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        Log.i("PlanetAdapter", "Called for position; " + position);
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.grid_item, null);
        Planet p = planetList.get(position);
        TextView tv = (TextView) convertView.findViewById(R.id.planetName);
        ImageView iv = (ImageView) convertView.findViewById(R.id.planetImage);
        tv.setText(p.getName());
        iv.setImageDrawable(p.getImage());
        return convertView;
    }


}
