package assignment;

public class Jump_Engine extends Engine {
	double jumpCharge;
	double cooldown;
	double maxJumpDistance;
	
	public Jump_Engine(String engineName, String fuelType, double speed, double energyUsage, double jumpCharge, double cooldown, double maxJumpDistance) {
		super(engineName, fuelType, speed, energyUsage);
		this.jumpCharge = jumpCharge;
		this.cooldown = cooldown;
		this.maxJumpDistance = maxJumpDistance;
	}
	
	public String Display() {
		StringBuilder sb = new StringBuilder("\n \nJUMP ENGINE STATS: ");
			sb.append("\n   Name: " + engineName);
			sb.append("\n   Fuel Type: " + fuelType);
			sb.append("\n   Maximum Speed: " + speed + "% of Light speed");
			sb.append("\n   Energy Usage: " + efficiency + " energy/Light Year");
			sb.append("\n   Jump Charge Rate: " + jumpCharge + " light-years/second");
			sb.append("\n   Jump Cooldown: " + cooldown + " seconds/light-years");
			sb.append("\n   Maximum Jump Distance: " + maxJumpDistance + " Light Years");
			
			return sb.toString();
	}
}
