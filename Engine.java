package assignment;

public class Engine {
	
	String engineName;
	String fuelType;
	double speed;
	double energyUsage;
	
	public Engine(String engineName, String fuelType, double speed, double energyUsage) {
		this.engineName = engineName;
		this.fuelType = fuelType;
		this.speed = speed;
		this.energyUsage = energyUsage;
	}
	
	public String display() {
		StringBuilder sb = new StringBuilder();
		
		return sb.toString();
	}
}