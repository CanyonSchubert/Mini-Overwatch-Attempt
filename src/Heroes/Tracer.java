package Heroes;
import Stats.*;

public class Tracer extends Hero {
	
	int blinkCharges;
	int previousVertical;
	int previousHorizontal;
	int previousHP;

	/**
	 * Pulse Pistols (Primary)
	 * Base Damage: 15
	 * Range: 1-3
	 * Hits: 5
	 * Accuracy: 90
	 * Actions Consumed: 2
	 * 
	 * Tracer fires a clip from each of her pistols. The pulse pistols are deadly at close range, but the damage and
	 * accuracy fall off quickly to 66% at a range of two, and then 33% at a range of three.
	 */
	WeaponPackage PulsePistols = new WeaponPackage(15, 1, 3, 5, 90, 2);
	
	/**
	 * Blink (Ability 1)
	 * Base Damage: 0
	 * Range: 2-2 (Straight Line)
	 * Hits: 0
	 * Cooldown: 0
	 * Actions Consumed: 0
	 * Channeled: No
	 * 
	 * Tracer blinks 2 tiles in a target direction. She can do this at any point during a turn, so long as she has
	 * the charges to do so. She can store up to three charges of Blink and receives one charge at the beginning
	 * of each turn.
	 */
	AbilityPackage Blink = new AbilityPackage(0, 2, 2, 0, 0, 0, false);
	
	/**
	 * Recall (Trait 1)
	 * Cooldown: 8
	 * 
	 * Upon taking fatal damage from an enemy, Tracer instead returns to the position and health she was at at the 
	 * beginning of the previous turn.
	 */
	TraitPackage Recall = new TraitPackage(8);
	
	/**
	 * Pulse Bomb (Ultimate)
	 * Base Damage: 300
	 * Range: 1-2
	 * Hits: 1
	 * Accuracy: 160%
	 * Actions Consumed: 3
	 * Channeled: No
	 * 
	 * Tracer throws her pulse bomb out at the target location. If it hits an enemy, it will stick to them; if it
	 * doesn't hit an enemy, it will stick to the ground at that location. Pulse Bomb loses half of its accuracy
	 * if thrown to a range of two. The bomb detonates at the start of your next turn, dealing full damage to
	 * the bomb tile and 50% damage to adjacent tiles. Pulse Bomb can also damage Tracer.
	 */
	UltimatePackage PulseBomb = new UltimatePackage(300, 1, 2, 1, 160, 3, false);
	
	public Tracer(int spawnVertical, int spawnHorizontal) {
		this.baseHP = 150;
		this.baseArmor = 0;
		this.baseShield = 0;
		this.actionPoints = 5;
		this.weight = 1;
		this.ultimateCount = 0;
		this.dodgeStat = 20;
		this.isAirborne = false;
		this.blinkCharges = 3;
		this.previousVertical = spawnVertical;
		this.previousHorizontal = spawnHorizontal;
	}

	public int getPreviousVertical() {
		return previousVertical;
	}

	public void setPreviousVertical(int previousVertical) {
		this.previousVertical = previousVertical;
	}

	public int getPreviousHorizontal() {
		return previousHorizontal;
	}

	public void setPreviousHorizontal(int previousHorizontal) {
		this.previousHorizontal = previousHorizontal;
	}

	public int getPreviousHP() {
		return previousHP;
	}

	public void setPreviousHP(int previousHP) {
		this.previousHP = previousHP;
	}
	
}