package net.ashraf.saveyourmony.creation;

import net.ashraf.saveyourmony.R;
import net.ashraf.saveyourmony.R.layout;
import net.ashraf.saveyourmony.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddOutlay extends Activity implements View.OnClickListener{
	  EditText name,  outlay_value;
	  Button button;
	  String Name,Outlay_value;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_outlay);
		    name = (EditText)this.findViewById(R.id.outlay_name);
	        outlay_value=(EditText)this.findViewById(R.id.value);
	        button = (Button) this.findViewById(R.id.btn_add);
	        button.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_outlay, menu);
		return true;
	}
	 
	
	/*****When the button click , i check the value , complete here*****/
    @Override
    public void onClick(View v) {

        switch(v.getId()){
       
        	

            case R.id.btn_add: 

                Name = name.getText().toString();
                Outlay_value=outlay_value.getText().toString();
                Boolean y= check(Name,Outlay_value);
                if(y==false){
                    name.setError("Invalid name");
                    outlay_value.setError("Invalid name");
                }
                if(y==true){
                    if (Name.isEmpty()) {
                        name.setError("Invalid name");

                    } else if (Outlay_value.isEmpty()) {
                    	outlay_value.setError("Invalid value");


                    }
                    
                    else {
                    	
                    	/******here write the code*****/
                    	
                    	
                    	
                    	
                    	 Toast toast = Toast.makeText(this, "informaion saved", Toast.LENGTH_LONG);
                         toast.show();

                    }
                }
            	
            	break;
            	
        }
        
        
    }
    
    
    public boolean check(String name,String Outlay_value){
        if(name.equals("") && Outlay_value.equals("") ){

            return false;
        }


        return true;
    }
}
