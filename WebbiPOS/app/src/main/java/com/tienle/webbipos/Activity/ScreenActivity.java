package com.tienle.webbipos.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.tienle.webbipos.CustomAdapter.SlidingAdapter;
import com.tienle.webbipos.CustomAdapter.SlidingItem;
import com.tienle.webbipos.Fragment.fragment_about;
import com.tienle.webbipos.Fragment.fragment_banhang;
import com.tienle.webbipos.Fragment.fragment_caidat;
import com.tienle.webbipos.Fragment.fragment_contact;
import com.tienle.webbipos.Fragment.fragment_datsan;
import com.tienle.webbipos.Fragment.fragment_giahandichvu;
import com.tienle.webbipos.Fragment.fragment_taikhoan;
import com.tienle.webbipos.Fragment.fragment_thanhtoan;
import com.tienle.webbipos.Fragment.fragment_thongke;
import com.tienle.webbipos.Fragment.fragment_timsan;
import com.tienle.webbipos.Fragment.fragment_trangchu;
import com.tienle.webbipos.MainActivity;
import com.tienle.webbipos.R;

import java.util.ArrayList;
import java.util.List;


public class ScreenActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    RelativeLayout drawerPane;
    ListView liv;

    List<SlidingItem> listItems;
    List<Fragment> listFragments;

    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        Intent intent = getIntent();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerPane = (RelativeLayout) findViewById(R.id.drawer_pane);

        liv = (ListView) findViewById(R.id.liv);

        listItems = new ArrayList<SlidingItem>();
        listItems.add(new SlidingItem("TRANG CHỦ", R.drawable.home_48dp));

        listItems.add(new SlidingItem("ĐẶT SÂN", R.drawable.datcho_3));
        listItems.add(new SlidingItem("TÌM SÂN", R.drawable.search_white_2));
        listItems.add(new SlidingItem("BÁN HÀNG", R.drawable.banhang_3));
        listItems.add(new SlidingItem("THỐNG KÊ", R.drawable.thongke_3));
        listItems.add(new SlidingItem("THANH TOÁN", R.drawable.thanhtoan_3));
        listItems.add(new SlidingItem("TÀI KHOẢN", R.drawable.taikhoan_3));
        listItems.add(new SlidingItem("CÀI ĐẶT", R.drawable.settings_4));
        listItems.add(new SlidingItem("GIA HẠN DỊCH VỤ", R.drawable.giahan_3));
        listItems.add(new SlidingItem("GIỚI THIỆU", R.drawable.ic_about_48dp));

        listItems.add(new SlidingItem("LIÊN HỆ/GÓP Ý", R.drawable.lienhe_3));

        SlidingAdapter slidingAdapter = new SlidingAdapter(
                getApplicationContext(), R.layout.list_sliding_item, listItems);

        liv.setAdapter(slidingAdapter);

        listFragments = new ArrayList<Fragment>();
        listFragments.add(new fragment_trangchu());

        listFragments.add(new fragment_datsan());
        listFragments.add(new fragment_timsan());
        listFragments.add(new fragment_banhang());
        listFragments.add(new fragment_thongke());
        listFragments.add(new fragment_thanhtoan());
        listFragments.add(new fragment_taikhoan());
        listFragments.add(new fragment_caidat());
        listFragments.add(new fragment_giahandichvu());
        listFragments.add(new fragment_about());
        listFragments.add(new fragment_contact());
        // load first fragment as default:
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.main_content, listFragments.get(0)).commit();

        setTitle(listItems.get(0).getTitle());
        liv.setItemChecked(0, true);
        drawerLayout.closeDrawer(drawerPane);

        // set listener for navigation items:
        liv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // replace the fragment with the selection correspondingly:
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.main_content, listFragments.get(position))
                        .commit();

                setTitle(listItems.get(position).getTitle());
                liv.setItemChecked(position, true);
                drawerLayout.closeDrawer(drawerPane);

            }
        });

        // create listener for drawer layout
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout,
                R.string.opened, R.string.closed) {

            @Override
            public void onDrawerOpened(View drawerView) {
                // TODO Auto-generated method stub
                invalidateOptionsMenu();
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                // TODO Auto-generated method stub
                invalidateOptionsMenu();
                super.onDrawerClosed(drawerView);
            }

        };

        drawerLayout.setDrawerListener(actionBarDrawerToggle);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the MyHome/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_thoat:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Thông báo!");
                builder.setMessage("Bạn chắc chắn muốn thoát?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intentthismenu = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intentthismenu);
                    }
                });
                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.create().show();
                break;
            case R.id.action_doimatkhau:
                Intent intentdoimatkhaumenu = new Intent(getApplicationContext(), DoimatkhauActivity.class);
                startActivity(intentdoimatkhaumenu);
                break;
            case R.id.action_thongtin:
                Intent intentthongtintkmenu = new Intent(getApplicationContext(), ThongtintaikhoanActivity.class);
                startActivity(intentthongtintkmenu);
                break;
        }


        if (actionBarDrawerToggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }
}
