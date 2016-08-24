package net.ashraf.saveyourmony;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
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

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_screen, menu);
		return true;
	}

}
