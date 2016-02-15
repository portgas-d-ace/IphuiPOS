package com.tienle.webbipos.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tienle.webbipos.Activity.CaidatActivity;
import com.tienle.webbipos.Activity.ThongkeActivity;
import com.tienle.webbipos.R;

/**
 * Created by HUUTIEN on 11/27/2015.
 */
public class fragment_trangchu extends Fragment implements View.OnClickListener {
    TextView txt_timsan, txt_taikhoan, txt_thongke, txt_caidat;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_trangchu, container, false);
        txt_timsan = (TextView) v.findViewById(R.id.txt_timsan);
        txt_thongke = (TextView) v.findViewById(R.id.txt_thongke);
        txt_taikhoan = (TextView) v.findViewById(R.id.txt_taikhoan11);
        txt_caidat = (TextView) v.findViewById(R.id.txt_caidat);
        txt_caidat.setOnClickListener(this);
txt_taikhoan.setOnClickListener(this);
        txt_thongke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentThongke = new Intent(getActivity(), ThongkeActivity.class);
                startActivity(intentThongke);
            }
        });
        return v;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txt_caidat:
                Intent intentcaidat = new Intent(getActivity(), CaidatActivity.class);
                startActivity(intentcaidat);
                break;

        }
    }
}
