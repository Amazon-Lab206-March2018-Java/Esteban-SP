package com.objectmaster.parttwo;

import com.objectmaster.partone.Human;

public class Samurai extends Human {
	private static int counter;

	public Samurai() {
		setHealth(200);
		counter++;
	}
	public Samurai(String name) {
		setHealth(200);
		setName(name);
		counter++;
	}
	public void deathBlow(Human target) {
		target.setHealth(0);
		this.setHealth(this.getHealth()/2);
		System.out.println(this.getName() + " killed "+target.getName()+ " with a death blow!");
		
	}
	public void meditate() {
		setHealth(getHealth()+(getHealth()/2));
		System.out.println(this.getName() + " restored 50% of remaining health points.");
	}
	public static int howMany() {
		return counter;
	}
}