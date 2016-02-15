package com.tienle.webbipos.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tienle.webbipos.R;

public class DoimatkhauActivity extends AppCompatActivity {
    Button btn_thuchien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doimatkhau);
        getSupportActionBar().setTitle("ĐỔI MẬT KHẨU");
        btn_thuchien = (Button) findViewById(R.id.btn_thuchien);
        btn_thuchien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DoimatkhauActivity.this, "Thực hiện thành công", Toast.LENGTH_LONG).show();
            }
        });

    }


}
