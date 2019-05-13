package assignment;

public class Ship_Superclass {
	String name;
	double health;
	Engine engine;
	Radar radar;	//Need to complete
	Hull hull;		//Need to complete
	
	public Ship_Superclass(String name, double health, Engine engine, Radar radar, Hull hull) {
		this.name = name;
		this.health = health;
		this.engine = engine;
		this.radar = radar;
		this.hull = hull;
	}
	
	public String getName() {
		return name;
	}
	
	public String display() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n        Name: " + name);
		sb.append("\n	Health: " + health);
		sb.append("\n	Engine: " + engine.engineName);
		sb.append("\n	Radar: " + radar.radarName);
		sb.append("\n	Hull: " + hull.hullName);
		return sb.toString();
	}
}
