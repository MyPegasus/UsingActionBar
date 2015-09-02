package com.example.mypegasus.usingactionbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by MyPegasus on 2015/9/2.
 */
public class SecondActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		// 貌似AndroidManifest.xml 中配置过parentActivity相关属性，就会自动显示出左上角的up button
//		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_second, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		/*if (id == R.id.action_settings) {
			return true;
		}*/

		switch (id) {
			case R.id.action_search:
				//Toast.makeText(this, "Action_Search", Toast.LENGTH_SHORT).show();
				startActivity(new Intent(this, ThirdActivity.class));
				break;
			case R.id.action_setting:
				Toast.makeText(this, "Action_Setting", Toast.LENGTH_SHORT).show();
				break;
		}

		return super.onOptionsItemSelected(item);
	}
}
