package com.tienle.webbipos.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.tienle.webbipos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HUUTIEN on 12/4/2015.
 */
public class fragment_thongke extends Fragment {
    ListView liv_baocaothongke;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.activity_thongke, container, false);
        liv_baocaothongke=(ListView)v.findViewById(R.id.liv_baocaothongke);
        List<String> ArrBaocao = new ArrayList<String>();
        ArrBaocao.add("Báo cáo tổng hợp ");
        ArrBaocao.add("Sân bãi");
        ArrBaocao.add("Xuất/nhập/tồn");
        ArrBaocao.add("Công nợ");
        ArrBaocao.add("Kinh doanh");
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, ArrBaocao);
        liv_baocaothongke.setAdapter(adapter);

        return v;
    }
}
