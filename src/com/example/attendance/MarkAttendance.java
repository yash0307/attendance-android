package com.example.attendance;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;

public class MarkAttendance extends Activity {

	GridView grid;

	static final String[] letters = new String[] { 
			"A1", "A2", "A3", "A4", "A5",
			"A6", "A7", "A8", "\n", "B1",
			"B2", "B3", "B4", "B5", "B6"	,
			"B7", "B8", "\n", "C1", "C2",
			"C3", "C4", "C5", "C6", "C7",
			"C8"};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_mark_attendance);

		grid = (GridView) findViewById(R.id.gridView);

		ArrayAdapter<?> adapter = new ArrayAdapter<Object>(this, android.R.layout.simple_list_item_1, letters);

		grid.setAdapter(adapter);

		grid.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
			   Toast.makeText(getApplicationContext(),
				((TextView) v).getText(), Toast.LENGTH_SHORT).show();
			}
		});

	}

}