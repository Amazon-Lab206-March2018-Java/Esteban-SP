package com.objectmaster.parttwo;

import com.objectmaster.partone.Human;

public class Wizard extends Human {
	public Wizard() {
		setHealth(50);
		setIntelligence(8);
	}
	public Wizard(String name) {
		setHealth(50);
		setIntelligence(8);
		setName(name);
	}
	public void heal(Human target) {
		target.setHealth(target.getHealth()+this.getIntelligence());
		System.out.println(this.getName() + " restored " + target.getName() + "'s health points by " + this.getIntelligence() + " units.");
	}
	public void fireball(Human target) {
		target.setHealth(target.getHealth()-(4*this.getIntelligence()));
		System.out.println(this.getName() + " dealed " +(4*this.getIntelligence())+" points of damage to " + target.getName()+".");
	}
}
