package net.ashraf.saveyourmony.creation;

import database.DatabaseHelper;
import net.ashraf.saveyourmony.R;
import net.ashraf.saveyourmony.R.layout;
import net.ashraf.saveyourmony.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddUser extends Activity {

	Button btnSubmit;
	EditText name, password, salary;
	DatabaseHelper db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_user);

		name = (EditText) findViewById(R.id.name);
		password = (EditText) findViewById(R.id.password);
		salary = (EditText) findViewById(R.id.salary);

		db = new DatabaseHelper(this);
	}

	/** take the value of name , password and salary then make a new acount to
	 login and using the application*/
	public void onClickNewUser() {

		long userId = db.insertUser(name.getText().toString(), password.getText().toString(),
				Integer.parseInt(salary.getText().toString()));
		if(userId != -1){
			Toast.makeText(getBaseContext(), "Succec", Toast.LENGTH_SHORT).show();
		}else{
			Toast.makeText(getBaseContext(), "faild", Toast.LENGTH_SHORT).show();
		}
	}

}
