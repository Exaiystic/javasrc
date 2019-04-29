package assignment;

public class Hull {
	String hullName;
	String hullMaterial;
	double hullFuelCapacity;
	double hullThickness;
	double hullVolume;
	double hullManouverability;
	
	public Hull(String hullName, String hullMaterial, double hullFuelCapacity, double hullThickness, double hullVolume, double hullManouverability) {
		this.hullName = hullName;
		this.hullMaterial = hullMaterial;
		this.hullFuelCapacity = hullFuelCapacity;
		this.hullThickness = hullThickness;
		this.hullVolume = hullVolume;
		this.hullManouverability = hullManouverability;
	}
	
	public String display() {
		StringBuilder sb = new StringBuilder("\n \nHULL STATS:");
			sb.append("\n	Name: " + hullName);
			sb.append("\n	Material: " + hullMaterial);
			sb.append("\n	Fuel Capacity: " + hullFuelCapacity + " fuel/metresCubed");
			sb.append("\n	Thickness: " + hullThickness + " mm");
			sb.append("\n	Volume: " + hullVolume + " metresCubed");
			
			return sb.toString();
	}
}
