package com.starwars.characters;

public class CharacterTesting {

	public static void main(String[] args) {
		Character luke = new Character("Luke Skywalker",77,"Hey look at my new Hand!!");
		Character vader = new Character("Darth Vader",136,"I am your father!");
		System.out.println(luke.saySomething());
		System.out.println(vader.saySomething());
		System.out.println(luke.sayHi(vader));
	}

}
