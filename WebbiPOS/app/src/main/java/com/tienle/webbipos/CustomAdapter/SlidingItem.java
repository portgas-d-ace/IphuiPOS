package com.tienle.webbipos.CustomAdapter;

/**
 * Created by HUUTIEN on 11/24/2015.
 */
public class SlidingItem {
    String title;
    int img_icon;

    public SlidingItem() {
    }

    public SlidingItem(String title, int img_icon) {
        this.title = title;
        this.img_icon = img_icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg_icon() {
        return img_icon;
    }

    public void setImg_icon(int img_icon) {
        this.img_icon = img_icon;
    }
}
