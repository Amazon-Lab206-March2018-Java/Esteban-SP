package zookeeper.partone;

public class Gorilla extends Mammal{
	public void throwSomething() {
		System.out.println("The Gorilla threw some stuff at you!");
		this.setEnergy(-5);
	}
	public void eatBanana() {
		System.out.println("The Gorilla is eating a Banana! The angry face changed to a friendly smile!");
		this.setEnergy(10);
	}
	public void climb() {
		System.out.println("The Gorilla is climbing the ropes now!");
		this.setEnergy(-10);
	}
}
