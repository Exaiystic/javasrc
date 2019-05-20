package assignment;

public class Engine {
	
	String engineName;
	String fuelType;
	double speed;
	double efficiency;
	
	public Engine(String engineName, String fuelType, double speed, double efficiency) {
		this.engineName = engineName;
		this.fuelType = fuelType;
		this.speed = speed;
		this.efficiency = efficiency;
	}
	
	public String display() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n        Name: " + engineName);
	    sb.append("\n        Fuel Type: " + fuelType);
		sb.append("\n        Speed: " + speed + "% light speed");
		sb.append("\n        Efficiency" + efficiency + "%");
		return sb.toString();
	}
}