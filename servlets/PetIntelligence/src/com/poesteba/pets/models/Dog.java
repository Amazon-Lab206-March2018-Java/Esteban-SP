package com.poesteba.pets.models;

public class Dog extends Animal implements Pet {
	public Dog() {
	}
	
	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		if (getWeight()<30) {
			return (getName()+", your "+getBreed()+", hopped into your lap and cuddled you");
		}else {
			return (getName()+", your "+getBreed()+", curled at your feet as is too big for your lap");
		}
	}

}
