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
		StringBuilder sb = new StringBuilder("\n \nWEAPON TYPE: PLASMA");
		sb.append(super.display());
		sb.append("\n        Blast Radius: " + blastRadius + " metres");
		sb.append("\n        Charge Rate: " + chargeSpeed + " seconds");
		sb.append("\n        Charge Cooldown: " + cooldownPerCharge + " per seconds of charge");
		return sb.toString();
		
	}
}
