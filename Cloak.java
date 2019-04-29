package assignment;

public class Cloak extends Defence {
	double cloakTime;
	double cloakAccuracy;
	double cloakCooldown;
	
	public Cloak(String defenceName, double defenceWeight, double defenceEfficiency, double cloakTime, double cloakAccuracy, double cloakCooldown) {
		super(defenceName, defenceWeight, defenceEfficiency);
		this.cloakTime = cloakTime;
		this.cloakAccuracy = cloakAccuracy;
		this.cloakCooldown = cloakCooldown;
	}
	public String display() {
		StringBuilder sb = new StringBuilder("CLOAK STATS:");
		    sb.append("\n   Name: " + defenceName);
		    sb.append("\n   Weight: " + defenceWeight);
			sb.append("\n   Energy/Second: " + defenceEfficiency);
			sb.append("\n   Max Cloak Length: " + cloakTime);
			sb.append("\n   Accuracy of Cloak: " + cloakAccuracy);
			sb.append("\n   Cloak Cooldown" + cloakCooldown + " seconds/second cloaked");
			
			return sb.toString();
	}
}
