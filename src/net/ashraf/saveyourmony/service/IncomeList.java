package net.ashraf.saveyourmony.service;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import net.ashraf.saveyourmony.R;
import net.ashraf.saveyourmony.R.layout;
import net.ashraf.saveyourmony.R.menu;
public class IncomeList extends Fragment {
	 
	
	  TextView value_Texpenses,value_income,result;
  //Overriden method onCreateView
  @Override
  

  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      
      //Returning the layout file after inflating 
      //Change R.layout.tab1 in you classes 
      return inflater.inflate(R.layout.activity_income_list, container, false);
     
      
  }
  
  
  @Override
  public void onActivityCreated(Bundle savedInstanceState) {
      super.onActivityCreated(savedInstanceState);
      value_Texpenses=(TextView)getActivity().findViewById(R.id.value_Texpenses);
      value_income=(TextView)getActivity().findViewById(R.id.value_income);
      result=(TextView)getActivity().findViewById(R.id.value_result);
      
      /***** When you get the values put it in value_Texpenses,value_income,result *****/
      
      
      

      
  }
}
