package net.ashraf.saveyourmony.service;

import java.util.ArrayList;
import net.ashraf.saveyourmony.R;
import net.ashraf.saveyourmony.R.layout;
import net.ashraf.saveyourmony.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class OutlayList extends Fragment {
 
	
	 TextView textView;
	    
	    MyAdapterClass arrayAdapter;
	    ListView listView;
    //overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        
        //Returning the layout file after inflating 
        //Change R.layout.tab1 in you classes 
        return inflater.inflate(R.layout.activity_outlay_list, container, false);
    }
    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
       
        listView=(ListView)getActivity().findViewById(R.id.listview);

        textView=(TextView)getActivity().findViewById(R.id.empty);


        listView.setEmptyView(textView);

 loadData();
        

    }
    

    public void loadData(){

        arrayAdapter=new MyAdapterClass(getActivity());
        listView.setAdapter(arrayAdapter);
    }
}


