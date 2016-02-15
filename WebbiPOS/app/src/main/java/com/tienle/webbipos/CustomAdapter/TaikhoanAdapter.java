package com.tienle.webbipos.CustomAdapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tienle.webbipos.R;

import java.util.List;

/**
 * Created by HUUTIEN on 12/1/2015.
 */
public class TaikhoanAdapter extends ArrayAdapter<TaikhoanItem> {
    Context context;
    int resLayout;
    List<TaikhoanItem> taikhoanItems;
    TextView txt_taikhoan;
    public TaikhoanAdapter(Context context, int resLayout,List<TaikhoanItem> taikhoanItems) {
        super(context, resLayout, taikhoanItems);
        this.context=context;
        this.resLayout=resLayout;
        this.taikhoanItems=taikhoanItems;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= View.inflate(context, resLayout, null);
        txt_taikhoan=(TextView)v.findViewById(R.id.txt_taikhoan2);
        TaikhoanItem taikhoanItem= getItem(position);
        txt_taikhoan.setText(taikhoanItem.getTentaikhoan());
        return v;

    }
}
