package com.tienle.webbipos.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.tienle.webbipos.Activity.CaidatconbanActivity;
import com.tienle.webbipos.Activity.ThucphamActivity;
import com.tienle.webbipos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HUUTIEN on 12/4/2015.
 */
public class fragment_caidat extends Fragment implements AdapterView.OnItemClickListener {
    ListView liv_caidat;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_caidat, container, false);
        liv_caidat = (ListView) v.findViewById(R.id.liv_caidat);
        List<String> arrcaidat = new ArrayList<String>();
        arrcaidat.add("Cài đặt cơ bản");
        arrcaidat.add("Thực phẩm");
        arrcaidat.add("Sân bãi");
        arrcaidat.add("Khuyến mại");
        arrcaidat.add("Gia hạn sử dụng");
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, arrcaidat);
        liv_caidat.setAdapter(adapter);
        liv_caidat.setOnItemClickListener(this);


        return v;
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //chua co su kien
        switch (position){
            case 0:
                Intent intentcaidatcoban = new Intent(getActivity(), CaidatconbanActivity.class);
                startActivity(intentcaidatcoban);
                break;
            case 1:
                Intent intentThucpham =  new Intent(getActivity(), ThucphamActivity.class);
                startActivity(intentThucpham);
                break;
        }
    }
}

