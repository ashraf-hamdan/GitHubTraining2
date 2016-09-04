package net.ashraf.saveyourmony.service;

import java.util.ArrayList;

import database.DatabaseHelper;

import android.app.Fragment;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import net.ashraf.saveyourmony.R;
import net.ashraf.saveyourmony.R.layout;
import net.ashraf.saveyourmony.R.menu;

public class IncomeList extends Fragment {

	DatabaseHelper databaseHelper;
	TextView value_Texpenses, value_income, result;
	Context context;
	Cursor texpenses;
	String income;
	double sum = 0;
	double res;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		context = container.getContext();
		// Returning the layout file after inflating
		// Change R.layout.tab1 in you classes
		return inflater
				.inflate(R.layout.activity_income_list, container, false);

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		value_Texpenses = (TextView) getActivity().findViewById(
				R.id.value_Texpenses);
		value_income = (TextView) getActivity().findViewById(R.id.value_income);
		result = (TextView) getActivity().findViewById(R.id.value_result);
		ArrayList<Double> arrayList = new ArrayList<Double>();

		/*****
		 * When you get the values put it in value_Texpenses,value_income,result
		 *****/

		databaseHelper = new DatabaseHelper(context);
		texpenses = databaseHelper.getAllOutalyByUserID("1");
		texpenses.moveToFirst();
		while (texpenses.isAfterLast() == false) {
			String value = texpenses.getString(texpenses
					.getColumnIndex("value"));

			arrayList.add(Double.parseDouble(value));

			texpenses.moveToNext();
		}
		for (int i = 1; i < arrayList.size(); i++) {
			sum = sum + arrayList.get(i);
		}

		value_Texpenses.setText(Double.toString(sum));

		income = databaseHelper.getSalaryByUserID("1");
		value_income.setText(income);

		res = Double.parseDouble(income) - sum;
		result.setText(Double.toString(res));

	}
}
