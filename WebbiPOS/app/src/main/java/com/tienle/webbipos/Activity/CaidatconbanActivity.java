package com.tienle.webbipos.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.tienle.webbipos.R;

public class CaidatconbanActivity extends AppCompatActivity implements View.OnClickListener {
ListView liv_caidatcb;
Button btn_capnhat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caidatconban);
        getSupportActionBar().setTitle("CÀI ĐẶT CƠ BẢN");
btn_capnhat=(Button)findViewById(R.id.btn_capnhat);
        btn_capnhat.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(CaidatconbanActivity.this, "Cập nhật thành công", Toast.LENGTH_SHORT).show();
    }
}
