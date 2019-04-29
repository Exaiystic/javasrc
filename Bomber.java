package assignment;

public class Bomber extends Ship_Superclass{
    Weapon frontWeapon;
    Weapon rightWeapon;
    Weapon rearWeapon;
    Weapon leftWeapon;
    Defence defence1;
    Defence defence2;
    Shield shield;
    
    public Bomber(String name, double health, Engine engine, Radar radar, Hull hull, Weapon frontWeapon, Weapon rearWeapon, Weapon rightWeapon, Weapon leftWeapon, Defence defence1, Defence defence2, Shield shield) {
    	super(name, health, engine, radar, hull);
    	this.frontWeapon = frontWeapon;
    	this.rightWeapon = rightWeapon;
    	this.rearWeapon = rearWeapon;
    	this.leftWeapon = leftWeapon;
    	this.defence1 = defence1;
    	this.defence2 = defence2;
    	this.shield = shield;
    }
	public String display() {
		StringBuilder sb = new StringBuilder("BOMBER SHIP STATS:");
			sb.append("\n        Name: " + name);
			sb.append("\n	Health: " + health);
			sb.append("\n	Engine: " + engine.engineName);
			sb.append("\n	Radar: " + radar.radarName);
			sb.append("\n	Hull: " + hull.hullName);
			sb.append("\n   Front Weapon: " + frontWeapon.weaponName);
			sb.append("\n   Right Weapon: " + rightWeapon.weaponName);
			sb.append("\n   Rear Weapon: " + rearWeapon.weaponName);
			sb.append("\n   Left Weapon: " + leftWeapon.weaponName);
			sb.append("\n   Primary Defense: " + defence1.defenceName);
			sb.append("\n   Secondary Defense: " + defence2.defenceName);
			sb.append("\n   Shield: " + shield.shieldName);
			sb.append("\n   FRONT WEAPON: " + frontWeapon.display());
			sb.append("\n   RIGHT WEAPON: " + rightWeapon.display());
			sb.append("\n   REAR WEAPON: " + rearWeapon.display());
			sb.append("\n   LEFT WEAPON: " + leftWeapon.display());
			sb.append("\n   PRIMARY DEFENSE: " + defence1.display());
			sb.append("\n   SECONDARY DEFENSE: " + defence2.display());
			sb.append(engine.display());
			sb.append(radar.display());
			sb.append(hull.display());
			sb.append(shield.display());
		
		return sb.toString();
	}
}
