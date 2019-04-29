package assignment;

public class Radar {
	String radarName;
	double radarScanRange;
	double radarScanFrequency;
	int radarMaxEntities;
	
	public Radar(String radarName, double radarScanRange, double radarScanFrequency, int radarMaxEntities) {
		this.radarName = radarName;
		this.radarScanRange = radarScanRange;
		this.radarScanFrequency = radarScanFrequency;
		this.radarMaxEntities = radarMaxEntities;
	}
	
	public String display() {	//Add to all but main classes
		StringBuilder sb = new StringBuilder("\n \nRADAR STATS:");
			sb.append("\n	Name: " + radarName);
			sb.append("\n	Scan Radius: " + radarScanRange + " miles");
			sb.append("\n	Scan Frequency: " + radarScanFrequency + " scans/minute");
			sb.append("\n	Max Detected Entities: " + radarMaxEntities);
			
		return sb.toString();
	}
}
