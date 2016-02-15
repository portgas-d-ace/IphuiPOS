package com.tienle.webbipos.CustomAdapter;

/**
 * Created by HUUTIEN on 12/3/2015.
 */
public class ThucphamItem {
    int img_thucpham;
    String tenthucpham;
    String giatien;
   String soluong;

    public ThucphamItem() {
    }

    public ThucphamItem(String tenthucpham, int img_thucpham) {
        this.tenthucpham = tenthucpham;
        this.img_thucpham = img_thucpham;
    }

    public ThucphamItem(int img_thucpham, String tenthucpham, String giatien) {
        this.img_thucpham = img_thucpham;
        this.tenthucpham = tenthucpham;
        this.giatien = giatien;
    }

    public ThucphamItem(int img_thucpham, String tenthucpham, String giatien, String soluong) {
        this.img_thucpham = img_thucpham;
        this.tenthucpham = tenthucpham;
        this.giatien = giatien;
        this.soluong = soluong;
    }

    public int getImg_thucpham() {
        return img_thucpham;
    }

    public void setImg_thucpham(int img_thucpham) {
        this.img_thucpham = img_thucpham;
    }

    public String getTenthucpham() {
        return tenthucpham;
    }

    public void setTenthucpham(String tenthucpham) {
        this.tenthucpham = tenthucpham;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }
}
