package com.example.padcc.webtechtest;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class OneFragment extends Fragment{
    List<People> peopleList=new ArrayList<>();
    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View rootView=inflater.inflate(R.layout.fragment_one, container, false);
        ListView listView=(ListView)rootView.findViewById(R.id.list_view);

        peopleList.add(new People(R.drawable.sachin,"Sachin","Sport"));
        peopleList.add(new People(R.drawable.amitabh,"Sachin","Sport"));
        peopleList.add(new People(R.drawable.sundar,"Sachin","Sport"));
        peopleList.add(new People(R.drawable.sachin,"Sachin","Sport"));
        peopleList.add(new People(R.drawable.smiley,"Sachin","Sport"));
        peopleList.add(new People(R.drawable.smily,"Sachin","Sport"));

        CustomAdaptor customAdaptor=new CustomAdaptor(this,peopleList);
        listView.setAdapter(customAdaptor);
        return rootView;

    }

//    class CustomAdaptor extends BaseAdapter {
//
//        @Override
//        public int getCount() {
//            return peopleList.size();
//        }
//
//        @Override
//        public Object getItem(int i) {
//            return null;
//        }
//
//        @Override
//        public long getItemId(int i) {
//            return 0;
//        }
//
//        public Context context;
//
//
//
//        @Override
//        public View getView(int position, View view, ViewGroup viewGroup) {
//            view = getLayoutInflater().inflate(R.layout.peoplelist, viewGroup, false);
//
//            ImageView imageView=(ImageView)view.findViewById(R.id.image1);
//            // TextView textViewName=(TextView)view.findViewById(R.id.name);
//            TextView textViewName=(TextView)view.findViewById(R.id.name);
//            TextView textViewDesc=(TextView)view.findViewById(R.id.desc);
//
//            imageView.setImageResource(peopleList.get(position).getImage());
//            textViewName.setText(peopleList.get(position).getName());
//            textViewDesc.setText(peopleList.get(position).getDesc());
//
//
//            return view;
//        }
//    }


}