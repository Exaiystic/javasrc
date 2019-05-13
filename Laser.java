package assignment;

public class Laser extends Weapon {
	double barrelLength;
	double barrelWidth;
	double energyPerAttack;
	double radiationPerAttack;
	
	public Laser(String weaponName, double weaponWeight, double weaponAttacksPerMinute, double weaponProjectileVelocity, double weaponCooldown, double weaponOverheat, double weaponRange, double weaponDamageDropoff, double barrelLength, double barrelWidth, double energyPerAttack, double radiationPerAttack) {
		super(weaponName, weaponWeight, weaponAttacksPerMinute, weaponProjectileVelocity, weaponCooldown, weaponOverheat, weaponRange, weaponDamageDropoff);
		this.barrelLength = barrelLength;
		this.barrelWidth = barrelWidth;
        this.energyPerAttack = energyPerAttack;
        this.radiationPerAttack = radiationPerAttack;
	}
	
	public String display() {
		StringBuilder sb = new StringBuilder("\n \nWEAPON TYPE: LASER");
		sb.append(super.display());
		sb.append("\n        Barrel Length: " + barrelLength + " mm");
		sb.append("\n        Barrel Width: " + barrelWidth + " mm");
		sb.append("\n        Energy Used: " + energyPerAttack + " energy/attack");
		sb.append("\n        Radiation Emission: " + radiationPerAttack + " rads/attack");
		return sb.toString();
	}
}
