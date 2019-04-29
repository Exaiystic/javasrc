package assignment;

public class AimDownSights extends Defence {
	double ADSResponse;
	double ADSAccuracy;
	double ADSReload;
	double ADSRange;

	public AimDownSights (String defenceName, double defenceWeight, double defenceEfficiency, double ADSResponse, double ADSAccuracy, double ADSReload, double ADSRange) {
		super(defenceName, defenceWeight, defenceEfficiency);
		this.ADSResponse = ADSResponse;
		this.ADSAccuracy = ADSAccuracy;
		this.ADSReload = ADSReload;
		this.ADSRange = ADSRange;
	}
	
	public String display() {
		StringBuilder sb = new StringBuilder("\n \n ACTIVE DEFENSE SYSTEM STATS:");
		    sb.append("\n        Name: " + defenceName);
		    sb.append("\n        Weight: " + defenceWeight);
			sb.append("\n        Energy/Projectile: " + defenceEfficiency);
			sb.append("\n        Response Time: " + ADSResponse + " seconds");
			sb.append("\n        Accuracy: " + ADSAccuracy + " hits/100 shots");
			sb.append("\n        Reload Time: " + ADSReload + " seconds");
			sb.append("\n        Range: " + ADSRange + " miles");
			
			return sb.toString();
	}
}