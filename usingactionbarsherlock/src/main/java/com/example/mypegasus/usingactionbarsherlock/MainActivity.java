package com.example.mypegasus.usingactionbarsherlock;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	private Spinner spinner;
	private Toolbar toolbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

/*//		spinner = (Spinner) findViewById(R.id.spinner);
//		spinner = new Spinner(this);

		ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
		for (int i = 0; i < 5; i++) {
			adapter.add("极客学院0" + i);
		}
		spinner.setAdapter(adapter);

		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(MainActivity.this, "Select " + position, Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {

			}
		});	*/

		System.out.println("onCreate...");

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);

		MenuItem item = menu.findItem(R.id.action_spinner);
		MenuItemCompat.setActionView(item, R.layout.action_sort);

//		spinner = (Spinner) findViewById(R.id.spinner);
//		spinner = new Spinner(this);
		spinner = (Spinner) MenuItemCompat.getActionView(item);

		ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
		for (int i = 0; i < 5; i++) {
			adapter.add("极客学院0" + i);
		}
		spinner.setAdapter(adapter);

		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(MainActivity.this, "Select " + position, Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {

			}
		});

		System.out.println("onCreateOptionsMenu...");
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
