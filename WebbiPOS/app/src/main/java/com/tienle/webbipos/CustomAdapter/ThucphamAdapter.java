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
 * Created by HUUTIEN on 12/3/2015.
 */
public class ThucphamAdapter extends ArrayAdapter<ThucphamItem> {
    List<ThucphamItem> thucphamItems;
    Context context;
    int reslayout;
    ImageView img_thucpham;
    TextView txt_tenthucpham, txt_giatien, txt_soluong;

    public ThucphamAdapter(Context context, int reslayout, List<ThucphamItem> thucphamItems) {
        super(context, reslayout, thucphamItems);
        this.context = context;
        this.reslayout = reslayout;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, reslayout, null);
        img_thucpham = (ImageView) v.findViewById(R.id.img_thucpham);
        txt_giatien = (TextView) v.findViewById(R.id.txt_giatien);
        txt_soluong = (TextView) v.findViewById(R.id.txt_soluong);
        txt_tenthucpham = (TextView) v.findViewById(R.id.txt_tenthucpham);
        ThucphamItem tp = getItem(position);
        img_thucpham.setImageResource(tp.getImg_thucpham());
        txt_giatien.setText(tp.getGiatien());
        txt_soluong.setText(tp.getSoluong());
        txt_tenthucpham.setText(tp.getTenthucpham());
        return v;
    }
}
