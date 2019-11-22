package Stats;

public class WeaponPackage {

	int damage;
	int minRange;
	int maxRange;
	int hits;
	int accuracy;
	int actionsConsumed;
	
	public WeaponPackage(int damage, int minRange, int maxRange, int hits, int accuracy, int actionsConsumed) {
		this.damage = damage;
		this.minRange = minRange;
		this.maxRange = maxRange;
		this.hits = hits;
		this.accuracy = accuracy;
		this.actionsConsumed = actionsConsumed;
	}
	
	public boolean isWeapon() {
		return true;
	}
	
	public boolean isAbility() {
		return false;
	}
	
	public boolean isTrait() {
		return false;
	}
	
	public boolean isUltimate() {
		return false;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getMinRange() {
		return minRange;
	}

	public void setMinRange(int minRange) {
		this.minRange = minRange;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getActionsConsumed() {
		return actionsConsumed;
	}

	public void setActionsConsumed(int actionsConsumed) {
		this.actionsConsumed = actionsConsumed;
	}
}