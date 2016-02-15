package com.tienle.webbipos.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import com.tienle.webbipos.R;

/**
 * Created by HUUTIEN on 11/27/2015.
 */
public class fragment_search extends Fragment {
    SeekBar sek_search1, sek_search2;

    TextView txt_search1, txt_search2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View v =inflater.inflate(R.layout.fragment_search, container, false);
        sek_search1=(SeekBar)v.findViewById(R.id.sek_search1);
        sek_search2=(SeekBar)v.findViewById(R.id.sek_search2);
        txt_search1=(TextView)v.findViewById(R.id.txt_search1);
        txt_search2=(TextView)v.findViewById(R.id.txt_search2);
        sek_search1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {


                txt_search1.setText("Thời gian bắt đầu: "+progress+"h");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sek_search2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txt_search2.setText("Thời gian kết thúc: "+progress+"h");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        return v;

    }


}
