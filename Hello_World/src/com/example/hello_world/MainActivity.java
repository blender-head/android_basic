package com.example.hello_world;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	WorldGen earth = new WorldGen("Earth", 5973, 9.78);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setStartUpWorldValues();
        setStartUpScreenText();
    }
    
    protected void setStartUpWorldValues()
    {
    	earth.setPlanetColonies(1);
        earth.setPlanetMilitary(1);
        earth.setColonyImmigration(1000);
        earth.setBaseProtection(100);
        earth.turnForceFieldOn();
    }
    
    private void setStartUpScreenText()
    {
    	TextView planetNameValue = (TextView)findViewById(R.id.dataView1);
    	planetNameValue.setText(earth.planetName);
    	
    	TextView planetMassValue = (TextView)findViewById(R.id.dataView2);
    	planetMassValue.setText(String.valueOf(earth.planetMass));
    	
    	TextView planetGravityValue = (TextView)findViewById(R.id.dataView3);
    	planetGravityValue.setText(String.valueOf(earth.planetGravity));
    	
    	TextView planetColoniesValue = (TextView)findViewById(R.id.dataView4);
    	planetColoniesValue.setText(String.valueOf(earth.planetColonies));
    	
    	TextView planetPopulationValue = (TextView)findViewById(R.id.dataView5);
    	planetPopulationValue.setText(String.valueOf(earth.planetPopulation));
    	
    	TextView planetMilitaryValue = (TextView)findViewById(R.id.dataView6);
    	planetMilitaryValue.setText(String.valueOf(earth.planetMilitary));
    	
    	TextView planetBaseValue = (TextView)findViewById(R.id.dataView7);
    	planetBaseValue.setText(String.valueOf(earth.planetBases));
    	
    	TextView planetForceFieldValue = (TextView)findViewById(R.id.dataView8);
    	planetForceFieldValue.setText(String.valueOf(earth.planetProtection));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item)
    {
    	switch(item.getItemId())
    	{
    		case R.id.menu_add:
    			Intent intent_add = new Intent(this, NewPlanetActivity.class);
    			this.startActivity(intent_add);
    			break;
    			
    		case R.id.menu_config:
    			Intent intent_config = new Intent(this, ConfigPlanetActivity.class);
    			this.startActivity(intent_config);
    			break;
    			
    		case R.id.menu_travel:
    			Intent intent_travel = new Intent(this, TravelPlanetActivity.class);
    			this.startActivity(intent_travel);
    			break;
    			
    		case R.id.menu_attack:
    			Intent intent_attack = new Intent(this, AttackPlanetActivity.class);
    			this.startActivity(intent_attack);
    			break;
    			
    		default:
    			return super.onOptionsItemSelected(item);
    	}
    	
    	return true;
    }
    
}
