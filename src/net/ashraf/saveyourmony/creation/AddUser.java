package net.ashraf.saveyourmony.creation;

import net.ashraf.saveyourmony.R;
import net.ashraf.saveyourmony.R.layout;
import net.ashraf.saveyourmony.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

public class AddUser extends Activity {

	Button btnSubmit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_user);
	}

	// take the value of name , password and salary then make a new acount to
	// login and using the application
	public void onClickNewUser() {

	}

}
