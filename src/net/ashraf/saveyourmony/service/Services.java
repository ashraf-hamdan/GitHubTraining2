package net.ashraf.saveyourmony.service;

import net.ashraf.saveyourmony.R;
import net.ashraf.saveyourmony.R.layout;
import net.ashraf.saveyourmony.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import net.ashraf.saveyourmony.R;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import net.ashraf.saveyourmony.R.layout;
import net.ashraf.saveyourmony.R.menu;

public class Services extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_services);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		setTitle("Save Youe Mony");

		ActionBar.Tab tab1 = actionBar.newTab().setText("Outlay");
		ActionBar.Tab tab2 = actionBar.newTab().setText("Income");

		Fragment outlayList = new OutlayList();
		Fragment incomeList = new IncomeList();

		tab1.setTabListener(new TabsPagerAdapter(outlayList));
		tab2.setTabListener(new TabsPagerAdapter(incomeList));

		actionBar.addTab(tab1);
		actionBar.addTab(tab2);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.services, menu);
		return true;
	}

}
