package net.ashraf.saveyourmony;

import net.ashraf.saveyourmony.creation.AddOutlay;
import net.ashraf.saveyourmony.creation.AddUser;
import android.os.Bundle;
import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
/**
 * 
 * @author ashraf
 *
 */
public class HomeScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_screen);
	}

	// method add new Outlay for the user of the app
    public void addOutlay(View v){
		Intent i = new Intent(HomeScreen.this,AddOutlay.class);
		startActivity(i);}

    //adding new User if not have one to use the app
    public void adduser(View v){
		Intent i = new Intent(HomeScreen.this,AddUser.class);
		startActivity(i);}

    //make some services for the user if the app
    public void Services(View v){
		Intent i = new Intent(HomeScreen.this,Service.class);
		startActivity(i);}

}
