package com.tienle.webbipos.CustomAdapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tienle.webbipos.R;

import java.util.List;

/**
 * Created by HUUTIEN on 11/24/2015.
 */
public class SlidingAdapter extends ArrayAdapter<SlidingItem> {

    Context context;
    int resLayout;
    List<SlidingItem> listItems;

    public  SlidingAdapter (Context context, int resLayout, List<SlidingItem> listItems) {
        super(context, resLayout, listItems);

        this.context = context;
        this.resLayout = resLayout;
        this.listItems = listItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(context, resLayout, null);

        TextView tvTitle  = (TextView) v.findViewById(R.id.txt_item);

        ImageView navIcon =  (ImageView) v.findViewById(R.id.img_item);

        SlidingItem navItem = listItems.get(position);

        tvTitle.setText(navItem.getTitle());

        navIcon.setImageResource(navItem.getImg_icon());
        return v;
    }




}

