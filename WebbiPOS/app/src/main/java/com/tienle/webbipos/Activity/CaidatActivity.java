package com.tienle.webbipos.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.tienle.webbipos.R;

public class CaidatActivity extends AppCompatActivity  {
ListView liv_caidat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caidat);
        getSupportActionBar().setTitle("CÀI ĐẶT");
//        liv_caidat =(ListView)findViewById(R.id.liv_caidat);
//        List<String> arrcaidat = new ArrayList<String>();
//        arrcaidat.add("Cài đặt cơ bản");
//        arrcaidat.add("Thực phẩm");
//        arrcaidat.add("Sân bãi");
//        arrcaidat.add("Khuyến mại");
//        arrcaidat.add("Gia hạn sử dụng");
//        ArrayAdapter adapter = new ArrayAdapter(CaidatActivity.this, android.R.layout.simple_list_item_1, arrcaidat);
//        liv_caidat.setAdapter(adapter);
//        liv_caidat.setOnItemClickListener(this);
//    }
//
//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//       //chua co su kien
//        switch (position){
//            case 0:
//                Intent intentcaidatcoban = new Intent(CaidatActivity.this, CaidatconbanActivity.class);
//                startActivity(intentcaidatcoban);
//                break;
//            case 1:
//                Intent intentThucpham =  new Intent(CaidatActivity.this, ThucphamActivity.class);
//                startActivity(intentThucpham);
//                break;
//        }
    }
}
