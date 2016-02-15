package com.tienle.webbipos.CustomAdapter;

/**
 * Created by HUUTIEN on 12/1/2015.
 */
public class TaikhoanItem {
    int img_taikhoan;
    String tentaikhoan;

    public TaikhoanItem(int img_taikhoan, String tentaikhoan) {
        this.img_taikhoan = img_taikhoan;
        this.tentaikhoan = tentaikhoan;
    }

    public int getImg_taikhoan() {
        return img_taikhoan;
    }

    public TaikhoanItem(String tentaikhoan) {
        this.tentaikhoan = tentaikhoan;
    }

    public void setImg_taikhoan(int img_taikhoan) {
        this.img_taikhoan = img_taikhoan;
    }

    public String getTentaikhoan() {
        return tentaikhoan;
    }

    public void setTentaikhoan(String tentaikhoan) {
        this.tentaikhoan = tentaikhoan;
    }
}
