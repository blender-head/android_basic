package com.example.hello_world;

import com.example.interfaces.*;

public class WorldGen implements IntWorldGen {
	String planetName = "Earth";
	int planetMass;
	double planetGravity;
	int planetColonies;
	long planetPopulation;
	int planetBases;
	int planetMilitary;
	boolean planetProtection;
	
	public WorldGen (String name, int mass, double gravity) {
		planetName = name;
		planetMass = mass;
		planetGravity = gravity;
		planetColonies = 0;
		planetPopulation = 0;
		planetBases = 0;
		planetMilitary = 0;
		planetProtection = false;
	}
	
	public void setPlanetColonies (int numColonies) {
		planetColonies += numColonies;
	}
	
	public int getPlanetColonies () {
		return planetColonies;
	}
	
	public void setPlanetMilitary (int numBases) {
		planetBases += numBases;
	}
	
	public int getPlanetMilitary () {
		return planetBases;
	}
	
	public void turnForceFieldOn () {
		planetProtection = true;
	}
	
	public void turnForceFieldOff () {
		planetProtection = false;
	}
	
	public boolean getForceFieldState() {
		return planetProtection;
	}
	
	public void setColonyImmigration (int numColonists) {
		planetPopulation += numColonists;
	}
	
	public long getColonyImmigration () {
		return planetPopulation;
	}
	
	public void setBaseProtection (int numForces) {
		planetMilitary += numForces;
	}
	
	public int getBaseProtection () {
		return planetMilitary;
	}
}
