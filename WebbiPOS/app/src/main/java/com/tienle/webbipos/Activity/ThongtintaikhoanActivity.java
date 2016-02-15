package com.tienle.webbipos.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tienle.webbipos.R;

public class ThongtintaikhoanActivity extends AppCompatActivity implements View.OnClickListener {
Button btn_luuthaydoi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtintaikhoan);
        getSupportActionBar().setTitle("THÔNG TIN TÀI KHOẢN");
btn_luuthaydoi=(Button)findViewById(R.id.btn_luuthaydoi);
        btn_luuthaydoi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_luuthaydoi:
                if(v.getId()==R.id.btn_luuthaydoi){
                    Toast.makeText(ThongtintaikhoanActivity.this,"Thực hiện thành công",Toast.LENGTH_LONG).show();
                }
        }
    }
}
