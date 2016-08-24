package net.ashraf.saveyourmony.creation;

import net.ashraf.saveyourmony.R;
import net.ashraf.saveyourmony.R.layout;
import net.ashraf.saveyourmony.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AddOutlay extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_outlay);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_outlay, menu);
		return true;
	}

}
