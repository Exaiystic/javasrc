package assignment;

public class Fighter extends Ship_Superclass {
	Weapon primary;
	Weapon secondary;
	Defence defence;
	Shield shield;	//Need to add values to shield class
	
	public Fighter (String name, double health, Engine engine, Radar radar, Hull hull, Weapon primary, Weapon secondary, Defence defence, Shield shield) {
		super(name, health, engine, radar, hull);
		this.primary = primary;
		this.secondary = secondary;
		this.defence = defence;
		this.shield = shield;
	}
	
	public String display() {
		StringBuilder sb = new StringBuilder("SHIP TYPE: FIGHTER");
		sb.append(super.display());
		sb.append("\n	Primary Weapon: " + primary.weaponName);
		sb.append("\n	Secondary Weapon: " + secondary.weaponName);
		sb.append("\n	Defence Mechanism: " + defence.defenceName);
		sb.append("\n	Shield: " + shield.shieldName);
		return sb.toString();
	}
	
	public String displayExpand() {
		StringBuilder sb = new StringBuilder("SHIP TYPE: FIGHTER");
		sb.append(super.displayExpand());
		sb.append(primary.display());
		sb.append(secondary.display());
		sb.append(defence.display());
		sb.append(shield.display());
		return sb.toString();
	}
}
