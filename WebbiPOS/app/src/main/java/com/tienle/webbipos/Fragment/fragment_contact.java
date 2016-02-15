package com.tienle.webbipos.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.tienle.webbipos.R;

/**
 * Created by HUUTIEN on 11/24/2015.
 */
public class fragment_contact extends Fragment {
    Button btn_guilienhe;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contact, container, false);
        btn_guilienhe = (Button) v.findViewById(R.id.btn_guilienhe);
        btn_guilienhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Cám ơn bạn đã gửi thông tin cho iPhủi, chúng tôi sẽ phản hồi sớm nhất",Toast.LENGTH_LONG).show();
//                final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//                builder.setTitle("Thông báo");
//                builder.setMessage("Cám ơn bạn đã gửi thông tin cho iPhủi, chúng tôi sẽ phản hồi sớm nhất.");
//                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//                builder.create().show();
            }
        });


        return v;

    }
}
