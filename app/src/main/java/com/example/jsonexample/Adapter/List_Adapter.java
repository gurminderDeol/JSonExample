package com.example.jsonexample.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.jsonexample.Modal.Student;
import com.example.jsonexample.R;

import java.util.ArrayList;

public class List_Adapter extends BaseAdapter
{
   // private ListView lstview;
    private Context context;
    private ArrayList<Student> studentArrayList;

    public List_Adapter(Context context, ArrayList<Student> studentArrayList) {
        this.context = context;
        this.studentArrayList = studentArrayList;

    }

    @Override
    public int getCount() {
        return studentArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return studentArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.customslist,parent, false);
        }

        TextView txtEid = convertView.findViewById(R.id.rid);
        TextView txtEnm = convertView.findViewById(R.id.rname);
        TextView txtECountry = convertView.findViewById(R.id.rgender);

        Student mEmployee = (Student) getItem(position);

        txtEid.setText(String.valueOf(mEmployee.getId()));
        txtEnm.setText(mEmployee.getName());
        txtECountry.setText(mEmployee.getGender());


        return convertView;

    }
}
