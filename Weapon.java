package assignment;

public class Weapon {
	String weaponName;
	double weaponWeight;
	double weaponAttacksPerMinute;
	double weaponProjectileVelocity;
	double weaponCooldown;
	double weaponOverheat;
	double weaponRange;
	double weaponDamageDropoff;
	
	public Weapon(String weaponName, double weaponWeight, double weaponAttacksPerMinute, double weaponProjectileVelocity, double weaponCooldown, double weaponOverheat, double weaponRange, double weaponDamageDropoff) {
		this.weaponName = weaponName;
		this.weaponWeight = weaponWeight;
		this.weaponAttacksPerMinute = weaponAttacksPerMinute;
		this.weaponProjectileVelocity = weaponProjectileVelocity;
		this.weaponCooldown = weaponCooldown;
		this.weaponOverheat = weaponOverheat;
		this.weaponRange = weaponRange;
		this.weaponDamageDropoff = weaponDamageDropoff;
	}
	
	public String display() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n        Weapon Name: " + weaponName);
		sb.append("\n        Weapon Weight: " + weaponWeight);
		sb.append("\n        Attack Rate: " + weaponAttacksPerMinute + " RPM");
		sb.append("\n        Projectile Velocity: " + weaponProjectileVelocity + " metres/second");
		sb.append("\n        Cooldown Rate: " + weaponCooldown + " seconds/attack");
		sb.append("\n        Weapon Overheat Rate: " + weaponOverheat + " seconds of continued fire");
		sb.append("\n        Weapon Range: " + weaponRange + " metres");
		sb.append("\n        Damage Dropoff: " + weaponDamageDropoff + " damage lost/metre");
		return sb.toString();
	}
}
