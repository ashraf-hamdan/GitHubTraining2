package net.ashraf.saveyourmony;

import database.DatabaseHelper;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_screen);

	}

	String username = findViewById(R.id.your_name).toString();
	String password = findViewById(R.id.Pass).toString();

	// class go from login page to home page
	public void onClickLogin(View v) {
		boolean isAvailable;
		DatabaseHelper databasehelper = new DatabaseHelper(null);
		isAvailable = databasehelper.Login(username, password);// method from
																// DatabaseHelper
																// Class

		if (isAvailable) {// if available go to home page
			Toast.makeText(getBaseContext(), "Success ^_^", Toast.LENGTH_SHORT)
					.show();
			Intent home_view = new Intent(this, HomeScreen.class);
			startActivity(home_view);
		} else {
			Toast.makeText(getBaseContext(), "Sign Up First, Please!",
					Toast.LENGTH_SHORT).show();
		}
	}
}
