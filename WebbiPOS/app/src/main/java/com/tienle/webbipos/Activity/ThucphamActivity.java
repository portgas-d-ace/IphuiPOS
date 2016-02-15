package com.tienle.webbipos.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.tienle.webbipos.CustomAdapter.ThucphamAdapter;
import com.tienle.webbipos.CustomAdapter.ThucphamItem;
import com.tienle.webbipos.R;

import java.util.ArrayList;
import java.util.List;

public class ThucphamActivity extends AppCompatActivity {
List<ThucphamItem> arr;
    ThucphamAdapter adapter;
    ListView liv_thucpham;
    FloatingActionButton btn_add1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thucpham);
        getSupportActionBar().setTitle("THỰC PHẨM");
        arr= new ArrayList<ThucphamItem>();
        arr.add(new ThucphamItem(R.drawable.banhmy, "Bánh mỳ", "10.000đ", "[5]"));
        arr.add(new ThucphamItem(R.drawable.cocacola, "Cocacola","10.000đ","[hết hàng]"));
        arr.add(new ThucphamItem(R.drawable.sting, "Sting","10.000đ","[10]"));
        btn_add1=(FloatingActionButton)findViewById(R.id.btn_add1);
        btn_add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentthemthucphammoi = new Intent(ThucphamActivity.this, ThemthucphammoiActivity.class);
                startActivity(intentthemthucphammoi);
            }
        });

        liv_thucpham=(ListView)findViewById(R.id.liv_thucpham);
        adapter = new ThucphamAdapter(ThucphamActivity.this,R.layout.layout_thucpham_item, arr);
        liv_thucpham.setAdapter(adapter);
//              chinh mau duong line dưới của item listview
//        int[] colors = {0, 0xFFFF0000, 0}; // red for the example
//        liv_thucpham.setDivider(new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, colors));
//        liv_thucpham.setDivider(new ColorDrawable(R.color.colorPrimaryDark,));
//        liv_thucpham.setDividerHeight(10);

//
//        ColorDrawable myColor = new ColorDrawable(
//                this.getResources().getColor(R.color.colorPrimaryDark)
//        );
//       liv_thucpham.getPositionForView()

    }


}
