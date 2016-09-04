package net.ashraf.saveyourmony.service;

import java.util.ArrayList;

import database.DatabaseHelper;
import net.ashraf.saveyourmony.R;
import net.ashraf.saveyourmony.R.layout;
import net.ashraf.saveyourmony.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class OutlayList extends Fragment {

	TextView textView;

	MyAdapterClass arrayAdapter;
	ListView listView;
	DatabaseHelper databaseHelper;
	Context context;
	ArrayList<Integer> id;
	ArrayList<String> name;
	ArrayList<String> value;
	ArrayList<String> date;
	String Name, Value, Date;
	int Id;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		context = container.getContext();

		return inflater
				.inflate(R.layout.activity_outlay_list, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		id = new ArrayList<Integer>();
		name = new ArrayList<String>();
		value = new ArrayList<String>();
		date = new ArrayList<String>();

		databaseHelper = new DatabaseHelper(context);
		Cursor cursor = databaseHelper.getAllOutalyByUserID("1");
		cursor.moveToFirst();
		while (cursor.isAfterLast() == false) {

			Id = cursor.getInt(cursor.getColumnIndex("id"));
			id.add(Id);
			Name = cursor.getString(cursor.getColumnIndex("name"));
			name.add(Name);
			Value = cursor.getString(cursor.getColumnIndex("value"));
			value.add(Value);
			Date = cursor.getString(cursor.getColumnIndex("get_date"));
			date.add(Date);

			cursor.moveToNext();
		}

		listView = (ListView) getActivity().findViewById(R.id.listview);
		arrayAdapter = new MyAdapterClass(context, id, name, value, date);
		listView.setAdapter(arrayAdapter);

	}

}
