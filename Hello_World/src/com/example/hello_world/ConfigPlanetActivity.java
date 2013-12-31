package com.example.hello_world;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ConfigPlanetActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_config_planet);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.config_planet, menu);
		return true;
	}

}
