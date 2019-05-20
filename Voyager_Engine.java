package assignment;

public class Voyager_Engine extends Engine {
	double accelerationTime;
	
	public Voyager_Engine(String engineName, String fuelType, double speed, double energyUsage, double accelerationTime) {
		super(engineName, fuelType, speed, energyUsage);
		this.accelerationTime = accelerationTime;
	}
	
	public String display() {
		StringBuilder sb = new StringBuilder("\n \nVOYAGER ENGINE STATS:");
		sb.append(super.display());
		sb.append("\n	Name: " + engineName);
		sb.append("\n	Fuel Type: " + fuelType);
		sb.append("\n	Max Speed: " + speed);
		sb.append("\n	Efficiency: " + efficiency);
		sb.append("\n	Acceleration: " + accelerationTime);
		
		return sb.toString();
	}
}
