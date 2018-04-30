package zookeeper.parttwo;

import zookeeper.partone.Mammal;

public class Dragon extends Mammal {
	public Dragon() {
		setEnergy(200);
	}
	public void fly() {
		System.out.println("Woooosh! The Dragon quickly elevated!");
		setEnergy(-50);
	}
	public void eatHumans() {
		System.out.println("Nooooooooo!!!! Help msaersgrsggh!");
		setEnergy(25);
	}
	public void attackTown() {
		System.out.println("Bits of ash in the air proof the death of a town nearby");
		setEnergy(-100);
	}
}
