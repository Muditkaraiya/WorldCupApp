package com.example.worldcupapp;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.time.temporal.Temporal;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<ModelClass> {

    private ArrayList<ModelClass>countryArraylist;
    Context context;
    public CustomAdapter(ArrayList<ModelClass>data,Context context){
        super(context,R.layout.my_layout,data);
        this.countryArraylist=data;
        this.context=context;
    }

    private static class ViewHolder{
    TextView Country;
    TextView CupWins;
    ImageView imageFlag;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        get the data item for this position
        ModelClass dataModel=getItem(position);
        ViewHolder viewHolder;

        final View result;

        if (convertView==null) {
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(R.layout.my_layout, parent, false);

            viewHolder.Country = (TextView) convertView.findViewById(R.id.textView3);
            viewHolder.CupWins = (TextView) convertView.findViewById(R.id.textView4);
            viewHolder.imageFlag = (ImageView) convertView.findViewById(R.id.imageView2);
            result = convertView;
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder=(ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.Country.setText(dataModel.getCountryNames());
        viewHolder.CupWins.setText(dataModel.getWorldCupWins());
        viewHolder.imageFlag.setImageResource(dataModel.getImgFlag());
        return convertView;
    }
}
