package com.poesteba.pets.models;

public class Cat extends Animal implements Pet {
	public Cat() {
		
	}

	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
	}
	@Override
	public String showAffection() {
		return (getName()+", your "+getBreed()+" looked at you with a grumpy face. It is their way of showing affection...");
	}
	
}
