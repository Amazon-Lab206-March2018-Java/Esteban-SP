package com.starwars.characters;

//Build a Character class to represent characters in Star Wars
public class Character {
	//Each Character should have a name, weight, and famous_saying
	private String name;
	private double weight;
	private String famous_saying;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getFamous_saying() {
		return famous_saying;
	}
	public void setFamous_saying(String famous_saying) {
		this.famous_saying = famous_saying;
	}
	//Each Character can be built one of two ways.
	//Either with all the attributes provided
	public Character(String name, double weight, String famous_saying) {
		setName(name);
		setWeight(weight);
		setFamous_saying(famous_saying);
	}
	//or with defaults you create.
	public Character(){  // default name "unknownCharacter", default weight is -1, default message "May the 4th be with you!"
		setName("unknownCharacter");
		setWeight(-1);
		setFamous_saying("May the 4th be with you!");
	}
	public Character(String name) {  // name provided, default weight is -1, default message "May the 4th be with you!"
		setName(name);
		setWeight(-1);
		setFamous_saying("May the 4th be with you!");
	}
	public Character(String name, double weight) { // name and weight provided, default message "May the 4th be with you!"
		setName(name);
		setWeight(weight);
		setFamous_saying("May the 4th be with you!");
	}
	public Character(String name, String famous_saying) {  //  name and saying provided, default weight -1
		setName(name);
		setWeight(-1);
		setFamous_saying(famous_saying);
	}
	//*Each Character should be able to introduce themselves to another Character, such as "Hello, Luke Skywalker, I'm Han Solo."
	public String sayHi(Character receiver) {
		return "Hello, "+receiver.getName()+", I'm "+this.getName();
	}
	public String saySomething() {
		return ("My name is "+getName()+", you will normally hear me say: '"+getFamous_saying()+"'.");
	}
}


