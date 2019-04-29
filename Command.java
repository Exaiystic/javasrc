package assignment;

public class Command extends Ship_Superclass {
    Weapon frontLeftWeapon;
    Weapon frontRightWeapon;
    Weapon leftFrontWeapon;
    Weapon leftBackWeapon;
    Weapon rightFrontWeapon;
    Weapon rightBackWeapon;
    Weapon rearLeftWeapon;
    Weapon rearRightWeapon;
    Weapon hullFRWeapon;
    Weapon hullFLWeapon;
    Weapon hullRRWeapon;
    Weapon hullRLWeapon;
    Defence defence1;
    Defence defence2;
    Defence defence3;
    
    public Command(String name, double health, Engine engine, Radar radar, Hull hull, Weapon frontLeftWeapon, Weapon frontRightWeapon, Weapon rightFrontWeapon, Weapon rightBackWeapon, Weapon leftFrontWeapon, Weapon leftBackWeapon, Weapon rearLeftWeapon, Weapon rearRightWeapon, Weapon hullFRWeapon, Weapon hullFLWeapon, Weapon hullRRWeapon, Weapon hullRLWeapon, Defence defence1, Defence defence2, Defence defence3) {
    	super(name, health, engine, radar, hull);
    	this.frontLeftWeapon = frontLeftWeapon;
    	this.frontRightWeapon = frontRightWeapon;
    	this.leftFrontWeapon = leftFrontWeapon;
    	this.leftBackWeapon = leftBackWeapon;
    	this.rightFrontWeapon = rightFrontWeapon;
    	this.rightBackWeapon = rightBackWeapon;
    	this.rearLeftWeapon = rearLeftWeapon;
    	this.rearRightWeapon = rearRightWeapon;
    	this.hullFRWeapon = hullFRWeapon;
    	this.hullFLWeapon = hullFLWeapon;
    	this.hullRRWeapon = hullRRWeapon;
    	this.hullRLWeapon = hullRLWeapon;
    	this.defence1 = defence1;
    	this.defence2 = defence2;
    	this.defence3 = defence3;
    }
    
	public String display() {
		StringBuilder sb = new StringBuilder("COMMAND SHIP STATS:");
		sb.append("\n        Name: " + name);
		sb.append("\n	Health: " + health);
		sb.append("\n	Engine: " + engine.engineName);
		sb.append("\n	Radar: " + radar.radarName);
		sb.append("\n	Hull: " + hull.hullName);
		sb.append("\n   Front Left Weapon: " + frontLeftWeapon.weaponName);
		sb.append("\n   Front Right Weapon: " + frontRightWeapon.weaponName);
		sb.append("\n   Left Side Front Weapon: " + leftFrontWeapon.weaponName);
		sb.append("\n   Left Side Back Weapon: " + leftBackWeapon.weaponName);
		sb.append("\n   Right Side Front Weapon: " + rightFrontWeapon.weaponName);
		sb.append("\n   Right Side Back Weapon: " + rightBackWeapon.weaponName);
		sb.append("\n   Rear Left Weapon: " + rearLeftWeapon.weaponName);
		sb.append("\n   Rear Right Weapon: " + rearRightWeapon.weaponName);
		sb.append("\n   Hull Belly Front Right Weapon: " + hullFRWeapon.weaponName);
		sb.append("\n   Hull Belly Front Left Weapon: " + hullFLWeapon.weaponName);
		sb.append("\n   Hull Belly Rear Right Weapon: " + hullRRWeapon.weaponName);
		sb.append("\n   Hull Belly Rear Left Weapon: " + hullRLWeapon.weaponName);
		sb.append("\n   Primary Defence: " + defence1.defenceName);
		sb.append("\n   Secondary Defence: " + defence2.defenceName);
		sb.append("\n   Tertiary Defence: " + defence3.defenceName);
		sb.append("\n   FRONT PANEL LEFT WEAPON: " + frontLeftWeapon.display());
		sb.append("\n   FRONT PANEL RIGHT WEAPON: " + frontRightWeapon.display());
		sb.append("\n   LEFT SIDE FRONT WEAPON: " + leftFrontWeapon.display());
		sb.append("\n   LEFT SIDE BACK WEAPON: " + leftBackWeapon.display());
		sb.append("\n   RIGHT SIDE FRONT WEAPON: " + rightFrontWeapon.display());
		sb.append("\n   RIGHT SIDE BACK WEAPON: " + rightBackWeapon.display());
		sb.append("\n   REAR PANEL LEFT WEAPON: " + rearLeftWeapon.display());
		sb.append("\n   REAR PANEL RIGHT WEAPON: " + rearRightWeapon.display());
		sb.append("\n   HULL BELLY FRONT RIGHT WEAPON: " + hullFRWeapon.display());
		sb.append("\n   HULL BELLY FRONT LEFT WEAPON: " + hullFLWeapon.display());
		sb.append("\n   HULL BELLY REAR RIGHT WEAPON: " + hullRRWeapon.display());
		sb.append("\n   HULL BELLY REAR LEFT WEAPON: " + hullRLWeapon.display());
		sb.append("\n   PRIMARY DEFENSE: " + defence1.display());
		sb.append("\n   SECONDARY DEFENSE: " + defence2.display());
		sb.append(engine.display());
		sb.append(radar.display());
		sb.append(hull.display());
		
		return sb.toString();
	}
}
