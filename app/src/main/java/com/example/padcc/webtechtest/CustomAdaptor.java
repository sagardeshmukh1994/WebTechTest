package com.example.padcc.webtechtest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class CustomAdaptor extends BaseAdapter {
    List<People> peopleList=new ArrayList<>();
private Context mContext;


//    public CustomAdaptor(Context mContext, List<People> peopleList) {
//      this.mContext = mContext;
//      this.peopleList = peopleList;
//    }

    @Override
    public int getCount() {
        return peopleList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = getLayoutInflater().inflate(R.layout.peoplelist, viewGroup, false);

        ImageView imageView=(ImageView)view.findViewById(R.id.image1);
        // TextView textViewName=(TextView)view.findViewById(R.id.name);
        TextView textViewName=(TextView)view.findViewById(R.id.name);
        TextView textViewDesc=(TextView)view.findViewById(R.id.desc);

        imageView.setImageResource(peopleList.get(position).getImage());
        textViewName.setText(peopleList.get(position).getName());
        textViewDesc.setText(peopleList.get(position).getDesc());


        return view;
    }
}

