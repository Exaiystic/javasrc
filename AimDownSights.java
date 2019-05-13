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
		StringBuilder sb = new StringBuilder("\n \nDEFENSE TYPE: ACTIVE DEFENSE SYSTEM");
		    sb.append(super.display());  
		    sb.append("\n        Response Time: " + ADSResponse + " seconds");
			sb.append("\n        Accuracy: " + ADSAccuracy + " hits/100 shots") ;
			sb.append("\n        Reload Time: " + ADSReload + " seconds");
			sb.append("\n        Range: " + ADSRange + " miles");
			return sb.toString();
	}
}