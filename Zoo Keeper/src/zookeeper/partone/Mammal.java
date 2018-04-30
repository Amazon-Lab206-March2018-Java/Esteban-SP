package zookeeper.partone;

public class Mammal {

	private int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("The current energy level of this mammal is: "+energyLevel);
		return energyLevel;
	}
	public void setEnergy(int num) {
		this.energyLevel+=num;
	}
}
