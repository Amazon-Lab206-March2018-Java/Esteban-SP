package com.objectmaster.parttwo;

import com.objectmaster.partone.Human;

public class Ninja extends Human {
	public Ninja() {
		setStealth(10);
	}
	public Ninja(String name) {
		setName(name);
		setStealth(10);
	}
	public void steal(Human target) {
		target.setHealth(target.getHealth()-this.getStealth());
		this.setHealth(this.getHealth()+this.getStealth());
		System.out.println(this.getName() + " stole "+this.getStealth()+" health points from "+target.getName()+".");
	}
	public void runAway() {
		setHealth(getHealth()-10);
		System.out.println(this.getName() + " ran away but lost 10 health points");
	}
}
