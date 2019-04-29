package assignment;

public class Shield {
    String shieldName;
	double shieldStrength;
	double shieldHealth;
    double shieldRecharge;
    
    public Shield(String shieldName, double shieldStrength, double shieldHealth, double shieldRecharge) {
    	this.shieldName = shieldName;
    	this.shieldStrength = shieldStrength;
    	this.shieldHealth = shieldHealth;
    	this.shieldRecharge = shieldRecharge;
    }
    
	public String display() {
		StringBuilder sb = new StringBuilder("\n \nSHIELD STATS:"); 
		sb.append("\n        Shield Name: " + shieldName);
		sb.append("\n        Shield Damage Modifier: " + shieldStrength);
		sb.append("\n        Shield Health: " + shieldHealth);
		sb.append("\n        Shield Recharge Delay: " + shieldRecharge + " seconds after being damaged");
		sb.append("\n        Shield Recharge Rate: " + shieldRecharge + " seconds to get to full shield");
		
		return sb.toString();
	}
}
