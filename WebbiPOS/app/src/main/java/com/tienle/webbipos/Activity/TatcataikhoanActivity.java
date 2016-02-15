package com.tienle.webbipos.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;

import com.tienle.webbipos.CustomAdapter.DataProvider;
import com.tienle.webbipos.CustomAdapter.MoviesAdapter;
import com.tienle.webbipos.CustomAdapter.TaikhoanAdapter;
import com.tienle.webbipos.CustomAdapter.TaikhoanItem;
import com.tienle.webbipos.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TatcataikhoanActivity extends AppCompatActivity implements ExpandableListView.OnChildClickListener {

    List<TaikhoanItem> taikhoanItemList;
    TaikhoanAdapter adapter;
    ListView liv_tatcataikhoan;
    HashMap<String, List<String>> Movies_category;
    List<String> Movies_list;
    ExpandableListView Exp_list;
    MoviesAdapter adapter1;
    ImageView img_parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatcataikhoan);
        getSupportActionBar().setTitle("TẤT CẢ TÀI KHOẢN");
//        taikhoanItemList = new ArrayList<TaikhoanItem>();
//        taikhoanItemList.add(new TaikhoanItem("tên tài khoản 1"));
//        taikhoanItemList.add(new TaikhoanItem("tên tài khoản 2"));
//        taikhoanItemList.add(new TaikhoanItem("tên tài khoản 3"));
//        taikhoanItemList.add(new TaikhoanItem("tên tài khoản 4"));
//        liv_tatcataikhoan = (ListView) findViewById(R.id.liv_tatcataitaikhoan);
//        adapter = new TaikhoanAdapter(getApplicationContext(), R.layout.expandable_parent, taikhoanItemList);
//        liv_tatcataikhoan.setAdapter(adapter);

//        liv_tatcataikhoan.setOnItemClickListener(this);
//
//    }
//
//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//            switch (position) {
//                case 0:
                    Exp_list = (ExpandableListView) findViewById(R.id.exp_list);

                    Movies_category = DataProvider.getInfo();
                    Movies_list = new ArrayList<String>(Movies_category.keySet());
                    adapter1 = new MoviesAdapter (TatcataikhoanActivity.this, Movies_category, Movies_list);
                    Exp_list.setAdapter(adapter1);
        Exp_list.setOnChildClickListener(this);
//                    break;
            }
//
//        }


    public int GetPixelFromDips ( float pixels){
        // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density;
        // Convert the dps to pixels, based on density scale
        return (int) (pixels * scale + 0.5f);
}

    @Override
    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
        switch (childPosition){
            case 0:
                Intent intent111= new Intent(TatcataikhoanActivity.this, DoimatkhauActivity.class);
                startActivity(intent111);
        }
        return true;
    }
}

