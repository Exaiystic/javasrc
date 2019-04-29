package assignment;

public class Mimic extends Defence {
	double maxMimics;
	double mimicHealth;
	double cooldown;
	double duration;
	
	public Mimic(String defenceName, double defenceWeight, double defenceEfficiency, double maxMimics, double mimicHealth, double cooldown, double duration) {
		super(defenceName, defenceWeight, defenceEfficiency);
		this.maxMimics = maxMimics;
	    this.mimicHealth = mimicHealth;
	    this.cooldown = cooldown;
	    this.duration = duration;
		
	}
	
	public String display() {	//Add to all but main classes
		StringBuilder sb = new StringBuilder("MIMIC STATS:");
			sb.append("\n   Name: " + defenceName);
			sb.append("\n   Weight: " + defenceWeight + " kg");
			sb.append("\n   Energy Usage: " + defenceEfficiency + " energy/projectile");
			sb.append("\n   Maximum amount of Mimics: " + maxMimics);
			sb.append("\n   Mimc Health: " + mimicHealth);
			sb.append("\n   Cooldown: " + cooldown + " seconds/mimic");
			sb.append("\n   Mimic Duration: " + duration + " seconds");
	
			return sb.toString();
	}
}
