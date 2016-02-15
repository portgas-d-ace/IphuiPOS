package com.tienle.webbipos.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.tienle.webbipos.R;

import java.util.ArrayList;
import java.util.List;

public class ThongkeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
ListView liv_baocaothongke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongke);
       getSupportActionBar().setTitle("BÁO CÁO/THỐNG KÊ");
        liv_baocaothongke=(ListView)findViewById(R.id.liv_baocaothongke);
        List<String> ArrBaocao = new ArrayList<String>();
        ArrBaocao.add("Báo cáo tổng hợp ");
        ArrBaocao.add("Sân bãi");
        ArrBaocao.add("Xuất/nhập/tồn");
        ArrBaocao.add("Công nợ");
        ArrBaocao.add("Kinh doanh");
        ArrayAdapter adapter = new ArrayAdapter(ThongkeActivity.this, android.R.layout.simple_list_item_1, ArrBaocao);
        liv_baocaothongke.setAdapter(adapter);
        liv_baocaothongke.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



    }


}
