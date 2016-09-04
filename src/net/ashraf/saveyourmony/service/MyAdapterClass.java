package net.ashraf.saveyourmony.service;

import java.util.ArrayList;

import android.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import net.ashraf.saveyourmony.R;
import net.ashraf.saveyourmony.R.layout;
import net.ashraf.saveyourmony.R.menu;

public class MyAdapterClass extends BaseAdapter {

	private Context context;

	TextView outlayId, outlayName, outlayValue, outlayDate;
	private ArrayList<Integer> id;
	private ArrayList<String> name;
	private ArrayList<String> value;
	private ArrayList<String> date;

	public MyAdapterClass(Context c, ArrayList<Integer> id,
			ArrayList<String> name, ArrayList<String> value,
			ArrayList<String> date) {
		this.context = c;
		this.id = id;
		this.date = date;
		this.name = name;
		this.value = value;
	}

	@Override
	public int getCount() {
		return id.size();

	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View arg1, ViewGroup arg2) {
		LayoutInflater layoutInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View view = layoutInflater.inflate(R.layout.item, null);

		outlayId = (TextView) view.findViewById(R.id.textView1);
		outlayName = (TextView) view.findViewById(R.id.textView2);
		outlayValue = (TextView) view.findViewById(R.id.textView3);
		outlayDate = (TextView) view.findViewById(R.id.textView4);

		outlayId.setText(String.valueOf(id.get(position)));
		outlayName.setText(name.get(position));
		outlayValue.setText(value.get(position));
		outlayDate.setText(date.get(position));

		return view;

	}

}
