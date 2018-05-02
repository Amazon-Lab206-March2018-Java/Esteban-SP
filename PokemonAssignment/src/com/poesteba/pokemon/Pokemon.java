package com.poesteba.pokemon;

public class Pokemon {  // 	Create a Pokemon class with:
	private static int count = 0;
	private String name;
	private int health;
	private String type;
	
	private static void countUp() {
		Pokemon.count++;
	}
	
	public Pokemon(String name) {
		this.name = name;
		health = 100;
		type = "normal";
		Pokemon.countUp();
	}
	public Pokemon(String name, int health) {
		this.name = name;
		this.health = health;
		type = "normal";
		Pokemon.countUp();
	}
	protected Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		Pokemon.countUp();
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Pokemon.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
