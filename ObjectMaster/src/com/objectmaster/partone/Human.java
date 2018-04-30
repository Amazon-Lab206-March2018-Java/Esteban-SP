package com.objectmaster.partone;

public class Human {
	private String name = "John Doe";
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	
	public Human() {
		
	}
	public Human(String name) {
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public void setHealth(int health) {
		this.health = health;
	}


	public int getHealth() {
		return health;
	}
	public void attack(Human target) {
		target.health-=this.strength;
	}
	
}
