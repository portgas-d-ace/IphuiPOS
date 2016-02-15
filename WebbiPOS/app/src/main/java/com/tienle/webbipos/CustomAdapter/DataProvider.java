package com.tienle.webbipos.CustomAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by HUUTIEN on 12/1/2015.
 */
public class DataProvider {
    public static HashMap<String, List<String>> getInfo() {
        HashMap<String, List<String>> MoviesDetails = new HashMap<String, List<String>>();

        List<String> Action_Movies = new ArrayList<String>();
        Action_Movies.add("Thông tin tài khoản");
        Action_Movies.add("Xóa tài khoản");
        Action_Movies.add("Khóa tài khoản");
        Action_Movies.add("Cấp lại mật khẩu");
        Action_Movies.add("Quyển truy cập");
        MoviesDetails.put("Tên tài khoản", Action_Movies);



        List<String> Action_Movies1 = new ArrayList<String>();
        Action_Movies1.add("Thông tin tài khoản");
        Action_Movies1.add("Xóa tài khoản");
        Action_Movies1.add("Khóa tài khoản");
        Action_Movies1.add("Cấp lại mật khẩu");
        Action_Movies1.add("Quyển truy cập");
        MoviesDetails.put("Tên tài khoản ", Action_Movies1);
        return MoviesDetails;

    }
}