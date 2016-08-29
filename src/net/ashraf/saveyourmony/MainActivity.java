package net.ashraf.saveyourmony;

import net.ashraf.saveyourmony.creation.AddUser;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	 public void newuser(View v){
			Intent i = new Intent(MainActivity.this,AddUser.class);
			startActivity(i);}
	 public void login(View v){
			Intent i = new Intent(MainActivity.this,LoginScreen.class);
			startActivity(i);}
}
