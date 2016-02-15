package com.tienle.webbipos.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tienle.webbipos.MainActivity;
import com.tienle.webbipos.R;

public class DangkiActivity extends AppCompatActivity {
Button btn_quaylaidangki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangki);
btn_quaylaidangki=(Button)findViewById(R.id.btn_quaylai);
        btn_quaylaidangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(DangkiActivity.this, MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
