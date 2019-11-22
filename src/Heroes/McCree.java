package Heroes;
import Stats.*;

public class McCree extends Hero {
	
	/**
	 * Peacekeeper (Primary)
	 * Base Damage: 70
	 * Range: 1-5 (Straight Line)
	 * Hits: 1
	 * Accuracy: 25% * Range
	 * Actions Consumed: 3
	 * 
	 * McCree fires a single round from his Peacekeeper in a straight line. It strikes the first target it makes
	 * contact with and it's accuracy increases the further away he is from his target.
	 */
	WeaponPackage Peacekeeper = new WeaponPackage(70, 1, 5, 1, 25, 3);
	
	/**
	 * Fan the Hammer (Secondary)
	 * Base Damage: 35
	 * Range: 1-1
	 * Hits: 6
	 * Accuracy: 30%
	 * Actions Consumed: 3
	 * 
	 * McCree quickly unloads all six rounds from his Peacekeeper, shooting wildly at the cost of damage, range, and accuracy.
	 */	
	WeaponPackage FanTheHammer = new WeaponPackage(35, 1, 1, 6, 30, 3);

	/**
	 * Flashbang (Ability 1)
	 * Base Damage: 10
	 * Range: 1-2
	 * Hits: 1
	 * Cooldown: 3
	 * Actions Consumed: 2
	 * Channeled: No
	 * 
	 * McCree throws a flashbang at the target location. Any enemies in that tile or adjacent ones have their
	 * action points halved (rounded up) the following turn, and any channeled abilities are interrupted;
	 */
	AbilityPackage Flashbang = new AbilityPackage(10, 1, 2, 1, 3, 2, false);
	
	/**
	 * Combat Roll (Trait 1)
	 * Cooldown: 5
	 * 
	 * When an enemy steps close to McCree, he rolls backwards two tiles and then fires his Peacekeeper
	 * in their direction.
	 */
	TraitPackage CombatRoll = new TraitPackage(5);
	
	/**
	 * Deadeye (Ultimate)
	 * Base Damage: 500
	 * Range: 1-5 (Directional Sweep w/o Peripherals)
	 * Hits: 1
	 * Accuracy: 200%
	 * Actions Consumed: 3
	 * Channeled: Yes
	 * 
	 * McCree stands off with enemies in his sightline. For the turn Deadeye is cast, McCree locks on to all enemies in his line of
	 * sight. At the start of the next turn, McCree accurately fires at any locked targets still in his sight for massive damage.
	 */
	UltimatePackage Deadeye = new UltimatePackage(300, 1, 5, 1, 200, 3, true);
	
	public McCree () {
		this.baseHP = 200;
		this.baseArmor = 0;
		this.baseShield = 0;
		this.actionPoints = 5;
		this.weight = 1;
		this.ultimateCount = 0;
		this.dodgeStat = 5;
		this.isAirborne = false;
	}
	
}