package com.tienle.webbipos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tienle.webbipos.Activity.DangkiActivity;
import com.tienle.webbipos.Activity.ScreenActivity;

public class MainActivity extends Activity  {
    Button btn_sigin ;
    TextView txt_login;
    EditText edt_nameacount, edt_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_sigin =(Button)findViewById(R.id.btn_signin);
 txt_login =(TextView)findViewById(R.id.txt_login);
        edt_nameacount=(EditText)findViewById(R.id.edt_tentaikhoan);
        edt_pass=(EditText)findViewById(R.id.edt_matkhau);



        btn_sigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, ScreenActivity.class);
                startActivity(intent);
            }
        });
txt_login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
Intent intent1=new Intent(MainActivity.this, DangkiActivity.class);
        startActivity(intent1);
    }
});



    }



}
