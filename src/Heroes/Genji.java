package Heroes;
import Stats.*;

public class Genji extends Hero {

	/**
	 * Shuriken (Primary)
	 * Base Damage: 23
	 * Range: 3-5 (Straight Line)
	 * Hits: 3
	 * Accuracy: 100%
	 * Actions Consumed: 2
	 * 
	 * Genji throws three shuriken in a straight line, each subsequent shuriken after the first
	 * losing 10% accuracy.
	 */
	WeaponPackage Shuriken = new WeaponPackage(23, 3, 5, 3, 100, 2);
	
	/**
	 * Tri-Shuriken (Secondary)
	 * Base Damage: 23
	 * Range: 1-2 (Outward Cone)
	 * Hits: 1
	 * Accuracy: 90%
	 * Actions Consumed: 3
	 * 
	 * Genji throws three shuriken in a cone formation. Range of one has straight line functionality,
	 * but all three shuriken will hit the target. Range of two hits the three tiles perpendicular to
	 * Genji past the adjacent tile.
	 */
	WeaponPackage TriShuriken = new WeaponPackage(23, 1, 2, 1, 90, 3);
	
	/**
	 * Swift Strike (Ability 1)
	 * Base Damage: 25
	 * Range: 5-5 (Straight Line)
	 * Hits: 1
	 * Cooldown: 3
	 * Actions Consumed: 1
	 * Channeled: No
	 * 
	 * Genji dashes a fixed distance in the target direction, damaging all enemies in his path. If there
	 * is an enemy at the target tile, he will land past them if possible. If Swift Strike scores a kill,
	 * it can be used again this turn. If Genji scores a kill in the same turn he used Swift Strike, it
	 * will be ready for use again next turn. If Genji hits an Airborne unit, he gains Airborne status
	 * until the start of your next turn. Tri-Shuriken and Dragonblade can hit other Airborne units.
	 */
	AbilityPackage SwiftStrike = new AbilityPackage(25, 5, 5, 1, 3, 1, false);
	
	/**
	 * Deflect (Ability 2)
	 * Base Damage: 0
	 * Range: 0-0 (Directional w/o Peripherals)
	 * Hits: 0
	 * Cooldown: 5
	 * Actions Consumed: 4
	 * Channeled: No
	 * 
	 * Genji enters a deflect state until the start of your next turn. In this state, Genji will deflect
	 * any projectile (non-melee) attack back at the user with the same accuracy, hits, and damage. Genji
	 * is also invincible during this time, but cannot use his shuriken abilities.
	 */
	AbilityPackage Deflect = new AbilityPackage(0, 0, 0, 0, 5, 4, false);
	
	/**
	 * Cybernetic Agility (Trait 1)
	 * Cooldown: 3
	 * 
	 * Genji is not slowed by any weight or terrain effects. In addition, Genji can vault over a wall every
	 * few turns.
	 */
	TraitPackage CyberneticAgility = new TraitPackage(3);
	
	/**
	 * Dragonblade (Ultimate)
	 * Base Damage: 120
	 * Range: 1-1 (Directional Sweep w/ Peripherals)
	 * Hits: 1
	 * Accuracy: 200%
	 * Actions Consumed: 2
	 * Channeled: No
	 * 
	 * Genji draws the blade from his back, losing access to his shuriken abilties and increasing the
	 * damage of his Swift Strike by 100%. Persists until the end of your next turn.
	 */
	UltimatePackage Dragonblade = new UltimatePackage(120, 1, 1, 1, 200, 2, false);
	
	public Genji() {
		this.baseHP = 200;
		this.baseArmor = 0;
		this.baseShield = 0;
		this.actionPoints = 5;
		this.weight = 1;
		this.ultimateCount = 0;
		this.dodgeStat = 25;
		this.isAirborne = false;
	}
	
}