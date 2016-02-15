package com.tienle.webbipos.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tienle.webbipos.R;

public class ThemtaikhoanmoiActivity extends AppCompatActivity {
Button btn_thuchien2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themtaikhoanmoi);
        getSupportActionBar().setTitle("THÊM TÀI KHOẢN MỚI");
        btn_thuchien2= (Button)findViewById(R.id.btn_thuchien2);
        btn_thuchien2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThemtaikhoanmoiActivity.this,"Thực hiện thành công", Toast.LENGTH_LONG).show();
//                AlertDialog.Builder builder = new AlertDialog.Builder(ThemtaikhoanmoiActivity.this);
//                builder.setTitle("Thông báo!");
//                builder.setMessage("Thực hiện thành công");
//                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        finish();
//                    }
//                });
//                builder.create().show();
            }
        });

    }
}
