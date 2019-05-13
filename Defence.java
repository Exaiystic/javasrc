package assignment;

public class Defence {
	String defenceName;
	double defenceWeight;
	double defenceEfficiency;
	
	public Defence(String defenceName, double defenceWeight, double defenceEfficiency) {
		this.defenceName = defenceName;
		this.defenceWeight = defenceWeight;
		this.defenceEfficiency = defenceEfficiency;
	}
	
	public String display() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n        Name: " + defenceName);
	    sb.append("\n        Weight: " + defenceWeight);
		sb.append("\n        Energy/Projectile: " + defenceEfficiency);
		return sb.toString();
	}
}
