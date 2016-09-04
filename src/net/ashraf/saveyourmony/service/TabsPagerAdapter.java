package net.ashraf.saveyourmony.service;

import net.ashraf.saveyourmony.R;
import net.ashraf.saveyourmony.R.id;
import net.ashraf.saveyourmony.R.layout;
import net.ashraf.saveyourmony.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class TabsPagerAdapter extends Activity implements ActionBar.TabListener {

	public Fragment fragment;

	public TabsPagerAdapter(Fragment fragment) {
		this.fragment = fragment;
	}

	@Override
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabSelected(Tab arg0, FragmentTransaction arg1) {

		arg1.replace(R.id.fragment_placeholder, fragment);

	}

	@Override
	public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub

	}

}
