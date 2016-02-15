package com.tienle.webbipos.CustomAdapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.tienle.webbipos.R;

import java.util.HashMap;
import java.util.List;

/**
 * Created by HUUTIEN on 11/30/2015.
 */
public class MoviesAdapter extends BaseExpandableListAdapter {
    private Context ctx;
    private HashMap<String, List<String>> Movies_Category;
    private List<String> Movies_List;

    public MoviesAdapter(Context ctx, HashMap<String, List<String>> Movies_Category, List<String> Movies_List )
    {
        this.ctx = ctx;
        this.Movies_Category = Movies_Category;
        this.Movies_List = Movies_List;

    }

    @Override
    public Object getChild(int parent, int child) {


        return Movies_Category.get(Movies_List.get(parent)).get(child);
    }

    @Override
    public long getChildId(int parent, int child) {
        // TODO Auto-generated method stub
        return child;
    }

    @Override
    public View getChildView(int parent, int child, boolean lastChild, View convertview,
                             ViewGroup parentview)
    {
        String child_title =  (String) getChild(parent, child);
        if(convertview == null)
        {
            LayoutInflater inflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertview = inflator.inflate(R.layout.layout_child, parentview,false);
        }
        TextView child_textview = (TextView) convertview.findViewById(R.id.txt_item_child);
        child_textview.setText(child_title);


        return convertview;
    }

    @Override
    public int getChildrenCount(int arg0) {

        return Movies_Category.get(Movies_List.get(arg0)).size();
    }

    @Override
    public Object getGroup(int arg0) {
        // TODO Auto-generated method stub
        return Movies_List.get(arg0);
    }

    @Override
    public int getGroupCount() {
        // TODO Auto-generated method stub
        return Movies_List.size();
    }

    @Override
    public long getGroupId(int arg0) {
        // TODO Auto-generated method stub
        return arg0;
    }

    @Override
    public View getGroupView(int parent, boolean isExpanded, View convertview, ViewGroup parentview) {
        // TODO Auto-generated method stub
        String group_title = (String) getGroup(parent);
        if(convertview == null)
        {
            LayoutInflater inflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertview = inflator.inflate(R.layout.layout_parent, parentview,false);
        }
        TextView parent_textview = (TextView) convertview.findViewById(R.id.txt_taikhoan1);
        parent_textview.setTypeface(null, Typeface.BOLD);
        parent_textview.setText(group_title);
        return convertview;
    }



    @Override
    public boolean hasStableIds() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isChildSelectable(int arg0, int arg1) {
        // TODO Auto-generated method stub
        return false;
    }


}




