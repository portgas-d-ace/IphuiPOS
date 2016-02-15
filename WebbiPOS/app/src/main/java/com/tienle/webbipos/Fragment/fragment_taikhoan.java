package com.tienle.webbipos.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.tienle.webbipos.Activity.DoimatkhauActivity;
import com.tienle.webbipos.Activity.TatcataikhoanActivity;
import com.tienle.webbipos.Activity.ThemtaikhoanmoiActivity;
import com.tienle.webbipos.Activity.ThongtintaikhoanActivity;
import com.tienle.webbipos.MainActivity;
import com.tienle.webbipos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HUUTIEN on 12/4/2015.
 */
public class fragment_taikhoan extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener {
    ListView liv_taikhoan;
    ActionBarDrawerToggle actionBarDrawerToggle;
    FloatingActionButton btn_add;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_taikhoan, container, false);


        btn_add = (FloatingActionButton) v.findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);

        liv_taikhoan = (ListView) v.findViewById(R.id.liv_taikhoan);
        List<String> arrtaikhoan = new ArrayList<String>();
        arrtaikhoan.add("Tất cả tài khoản");
        arrtaikhoan.add("Thêm tài khoản mới");
        arrtaikhoan.add("Thông tin tài khoản");
        arrtaikhoan.add("Đổi mật khẩu");
        arrtaikhoan.add("Thoát");
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, arrtaikhoan);
        liv_taikhoan.setAdapter(adapter);
        liv_taikhoan.setOnItemClickListener(this);
        return v;

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                Intent intenttatcataikhoan = new Intent(getActivity(), TatcataikhoanActivity.class);
                startActivity(intenttatcataikhoan);
                break;
            case  1:
                Intent intentthemtaikhoanmoi = new Intent(getActivity(), ThemtaikhoanmoiActivity.class);
                startActivity(intentthemtaikhoanmoi);
                break;
            case 2:
                Intent intentthongtintaikhoan = new Intent(getActivity(), ThongtintaikhoanActivity.class);
                startActivity(intentthongtintaikhoan);
                break;
            case  3:
                Intent intentdoimatkhau = new Intent(getActivity(), DoimatkhauActivity.class);
                startActivity(intentdoimatkhau);
                break;
            case 4:
                Intent intentthoat = new Intent(getActivity(), MainActivity.class);
                startActivity(intentthoat);


                break;
        }

    }

    @Override
    public void onClick(View v) {
        Intent intenthemmoitaikhoan= new Intent(getActivity(), ThemtaikhoanmoiActivity.class);
        startActivity(intenthemmoitaikhoan);
    }








}

