package com.example.attendance;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class ChooseCourseActivity extends Activity {
	public final static String EXTRA_MESSAGE="com.example.attendance.MESSAGE";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose_course);
		OurOwnSpinner();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.choose_course, menu);
		return true;
	}
	public void course(View view)
	{
		Intent intent = new Intent(this, Test.class);
		EditText editText = (EditText) findViewById(R.id.planets_spinner);
		String course = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, course);
		startActivity(intent);
	}
	public void OurOwnSpinner() {
		Spinner spinner = (Spinner) findViewById(R.id.planets_spinner);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		        R.array.planets_array, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);
	}
	
}
