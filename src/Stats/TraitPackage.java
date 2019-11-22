package Stats;

public class TraitPackage {

	int cooldown;
	
	public TraitPackage(int cooldown) {
		this.cooldown = cooldown;
	}
	
	public boolean isWeapon() {
		return false;
	}
	
	public boolean isAbility() {
		return false;
	}
	
	public boolean isTrait() {
		return true;
	}
	
	public boolean isUltimate() {
		return false;
	}

	public int getCooldown() {
		return cooldown;
	}

	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}
	
}