package net.ashraf.saveyourmony.service;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import net.ashraf.saveyourmony.R;
import net.ashraf.saveyourmony.R.layout;
import net.ashraf.saveyourmony.R.menu;

public class MyAdapterClass extends BaseAdapter {
    
    private Context context;
  
    TextView textView1,textView2,textView3,textView4;
    String outlay_id,Outlay_name,Outlay_value,Outlay_date;
   


    public MyAdapterClass(){

    }

    public MyAdapterClass(Context context){

        
        this.context=context;


    }

 
    @Override
    public int getCount() {
        return 1;  /***** Must change depend on the number of value from database**/
    }

    @Override
    public Object getItem(int position) {
        return null;/***** must change depend on  database**/
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=null;
        //ViewHolder viewHolder;
        if(convertView==null){


            LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view= layoutInflater.inflate(R.layout.item,parent,false);


        }
        else {
            view=convertView;

        }

        textView1=(TextView)view.findViewById(R.id.textView1);
        textView2=(TextView)view.findViewById(R.id.textView2);

        textView3=(TextView)view.findViewById(R.id.textView3);
        textView4=(TextView)view.findViewById(R.id.textView4);
        
        
        
        
        /******get the data frome database then add it to textview1,textview2,textview3,textview4*****/
       

        return view;

    }
}


