package com.example.mypegasus.usingactionbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/**
		 * actionBar.setNavigationMode、newTab()、addTab()都已经deprecated
		 * */
		/*
		ActionBar actionBar = getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);// deprecated

		ActionBar.TabListener tabListener = new ActionBar.TabListener() {
			@Override
			public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
				Toast.makeText(MainActivity.this, "Tab Selected " + tab.getPosition(), Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

			}

			@Override
			public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

			}
		};

		for (int i = 0; i < 3; i++) {
			ActionBar.Tab tab = actionBar.newTab();
			tab.setText("Tab" + i);
			tab.setTabListener(tabListener);
			actionBar.addTab(tab);
		}*/

		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		toolbar.setTitle("Title");
		if (toolbar != null) {
			setSupportActionBar(toolbar);
			// 并没有起作用
			toolbar.inflateMenu(R.menu.menu_main);
		}

		toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				int id = item.getItemId();

				switch (id) {
					case R.id.home:
						break;
					case android.R.id.home:// 这个才是左上角图标id
						finish();
						break;
					case R.id.action_search:
						//Toast.makeText(this, "Action_Search", Toast.LENGTH_SHORT).show();
						startActivity(new Intent(MainActivity.this, SecondActivity.class));
						break;
					case R.id.action_setting:
						//Toast.makeText(this, "Action_Setting", Toast.LENGTH_SHORT).show();
						startActivity(new Intent(MainActivity.this, ThirdActivity.class));
						break;
				}
				return false;
			}
		});
		toolbar.setNavigationIcon(R.mipmap.ic_launcher);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		TabLayout tabs = (TabLayout) findViewById(R.id.sliding_tabs);

		for (int i = 0; i < 3; i++) {
			TabLayout.Tab tab = tabs.newTab();
			tab.setText("Tab" + i);
			tabs.addTab(tab);
		}

		tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
			@Override
			public void onTabSelected(TabLayout.Tab tab) {
				Toast.makeText(MainActivity.this, "Tab Selected " + tab.getPosition(), Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onTabUnselected(TabLayout.Tab tab) {

			}

			@Override
			public void onTabReselected(TabLayout.Tab tab) {

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	/*@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		*//*if (id == R.id.action_settings) {
			return true;
		}*//*

		switch (id) {
			case R.id.home:
				break;
			case android.R.id.home:// 这个才是左上角图标id
				finish();
				break;
			case R.id.action_search:
				//Toast.makeText(this, "Action_Search", Toast.LENGTH_SHORT).show();
				startActivity(new Intent(this, SecondActivity.class));
				break;
			case R.id.action_setting:
				//Toast.makeText(this, "Action_Setting", Toast.LENGTH_SHORT).show();
				startActivity(new Intent(this, ThirdActivity.class));
				break;
		}

		return super.onOptionsItemSelected(item);
	}*/
}
