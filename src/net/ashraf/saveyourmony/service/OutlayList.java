package net.ashraf.saveyourmony.service;

import net.ashraf.saveyourmony.R;
import net.ashraf.saveyourmony.R.layout;
import net.ashraf.saveyourmony.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class OutlayList extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_outlay_list);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.outlay_list, menu);
		return true;
	}

}
