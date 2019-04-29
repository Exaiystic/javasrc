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
		
		return sb.toString();
	}
}
