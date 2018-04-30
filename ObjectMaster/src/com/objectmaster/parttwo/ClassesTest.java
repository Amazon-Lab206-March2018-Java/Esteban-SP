package com.objectmaster.parttwo;

public class ClassesTest {

	public static void main(String[] args) {
		Ninja naruto = new Ninja("Naruto");
		Samurai kenshin = new Samurai("Kenshin");
		Samurai afroSamurai = new Samurai("AfroSamurai");
		Samurai pancho = new Samurai("Pancho");
		Wizard merlin = new Wizard("Merlin");
		
		naruto.steal(kenshin);
		naruto.steal(pancho);
		pancho.deathBlow(kenshin);
		merlin.fireball(naruto);
		merlin.heal(pancho);
		afroSamurai.meditate();
		System.out.println("Currently there are "+Samurai.howMany()+" Samurais in the field");
		
	}

}
