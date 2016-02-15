package com.tienle.webbipos.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.tienle.webbipos.MainActivity;
import com.tienle.webbipos.R;

import java.util.ArrayList;
import java.util.List;

public class TaikhoanActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    ListView liv_taikhoan;
    ActionBarDrawerToggle actionBarDrawerToggle;
    FloatingActionButton btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taikhoan);
        getSupportActionBar().setTitle(R.string.search_trangchu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_add=(FloatingActionButton)findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);

        liv_taikhoan = (ListView) findViewById(R.id.liv_taikhoan);
        List<String> arrtaikhoan = new ArrayList<String>();
        arrtaikhoan.add("Tất cả tài khoản");
        arrtaikhoan.add("Thêm tài khoản mới");
        arrtaikhoan.add("Thông tin tài khoản");
        arrtaikhoan.add("Đổi mật khẩu");
        arrtaikhoan.add("Thoát");
        ArrayAdapter adapter = new ArrayAdapter(TaikhoanActivity.this, android.R.layout.simple_list_item_1, arrtaikhoan);
        liv_taikhoan.setAdapter(adapter);
        liv_taikhoan.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                Intent intenttatcataikhoan = new Intent(TaikhoanActivity.this, TatcataikhoanActivity.class);
                startActivity(intenttatcataikhoan);
                break;
            case  1:
                Intent intentthemtaikhoanmoi = new Intent(TaikhoanActivity.this, ThemtaikhoanmoiActivity.class);
                startActivity(intentthemtaikhoanmoi);
                break;
            case 2:
                Intent intentthongtintaikhoan = new Intent(TaikhoanActivity.this, ThongtintaikhoanActivity.class);
                startActivity(intentthongtintaikhoan);
                break;
            case  3:
                Intent intentdoimatkhau = new Intent(TaikhoanActivity.this, DoimatkhauActivity.class);
                startActivity(intentdoimatkhau);
                break;
            case 4:
                Intent intentthoat = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentthoat);


                break;
        }

    }

    @Override
    public void onClick(View v) {
        Intent intenthemmoitaikhoan= new Intent(TaikhoanActivity.this, ThemtaikhoanmoiActivity.class);
        startActivity(intenthemmoitaikhoan);
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return View.inflate(TaikhoanActivity.this, R.layout.activity_taikhoan,null);
    }
}


