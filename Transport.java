package assignment;

public class Transport extends Ship_Superclass {
	Weapon frontWeapon;
	Weapon rearWeapon;
	Defence defence1;
	Defence defence2;
	Defence defence3;
	Shield shield;
	
	public Transport(String name, double health, Engine engine, Radar radar, Hull hull, Defence defence1, Defence defence2, Defence defence3, Weapon frontWeapon, Weapon rearWeapon, Shield shield) {
		super(name, health, engine, radar, hull);
		this.defence1 = defence1;
		this.defence2 = defence2;
		this.defence3 = defence3;
		this.frontWeapon = frontWeapon;
		this.rearWeapon = rearWeapon;
		this.shield = shield;
	}

}
