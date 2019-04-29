package assignment;

public class Plasma extends Weapon {
	double blastRadius;
	double chargeSpeed;
	double cooldownPerCharge;
	
	public Plasma(String weaponName, double weaponWeight, double weaponAttacksPerMinute, double weaponProjectileVelocity, double weaponCooldown, double weaponOverheat, double weaponRange, double weaponDamageDropoff, double blastRadius, double chargeSpeed, double cooldownPerCharge) {
		super(weaponName, weaponWeight, weaponAttacksPerMinute, weaponProjectileVelocity, weaponCooldown, weaponOverheat, weaponRange, weaponDamageDropoff);
		this.blastRadius = blastRadius;
		this.chargeSpeed = chargeSpeed;
		this.cooldownPerCharge = cooldownPerCharge;
	}

	public String display() {
		StringBuilder sb = new StringBuilder("\n \nPLASMA WEAPON STATS:"); 
		sb.append("\n        Weapon Name: " + weaponName);
		sb.append("\n        Weapon Weight: " + weaponWeight);
		sb.append("\n        Attack Rate: " + weaponAttacksPerMinute + " RPM");
		sb.append("\n        Projectile Velocity: " + weaponProjectileVelocity + " metres/second");
		sb.append("\n        Cooldown Rate: " + weaponCooldown + " seconds/attack");
		sb.append("\n        Weapon Overheat Rate: " + weaponOverheat + " seconds of continued fire");
		sb.append("\n        Weapon Range: " + weaponRange + " metres");
		sb.append("\n        Damage Dropoff: " + weaponDamageDropoff + " damage lost/metre");
		sb.append("\n        Blast Radius: " + blastRadius + " metres");
		sb.append("\n        Charge Rate: " + chargeSpeed + " seconds");
		sb.append("\n        Charge Cooldown: " + cooldownPerCharge + " per seconds of charge");
			
		return sb.toString();
		
	}
	@Override
	public String toString() {
		return "Plasma Weapon";
	}
}
