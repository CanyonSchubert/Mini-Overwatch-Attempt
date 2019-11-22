package Heroes;
import Stats.*;

public class Pharah extends Hero {

	/**
	 * Rocket Launcher (Primary)
	 * Base Damage: 120
	 * Range: 0-10
	 * Hits: 1
	 * Accuracy: 60%
	 * Actions Consumed: 3
	 * 
	 * Pharah launches a rocket at the target location. This rocket deals full damage to that
	 * tile and 25% to adjacent tiles. The rocket has 150% accuracy if fired to her tile or an
	 * adjacent tile. If the rocket misses, it will randomly hit one of the adjacent tiles. 
	 * Pharah can be hurt by the splash.
	 */
	WeaponPackage RocketLauncher = new WeaponPackage(120, 0, 10, 1, 100, 3);
	
	/**
	 * Jump Jet (Ability 1)
	 * Base Damage: 0
	 * Range: 0-0
	 * Hits: 0
	 * Cooldown: 3
	 * Actions Consumed: 2
	 * Channeled: No
	 * 
	 * Pharah launches herself into the air, gaining the Airborne status. While Airborne, she can
	 * only be hit with attacks that can hit airborne units and is immune to her own splash damage.
	 * Airborne persists until the end of your next turn.
	 */
	AbilityPackage JumpJet = new AbilityPackage(0, 0, 0, 0, 3, 2, false);
	
	/**
	 * Concussive Blast (Ability 2)
	 * Base Damage: 0
	 * Range: 0-8
	 * Hits: 1
	 * Cooldown: 4
	 * Actions Consumed: 2
	 * Channeled: No
	 * 
	 * Pharah fires a concussive blast at the target location. Enemies in adjacent tiles get knocked
	 * back 3 tiles from the blast. Any enemy in the target tile is knocked Airborne until the end
	 * of their next turn but is otherwise unaffected.
	 */
	AbilityPackage ConcussiveBlast = new AbilityPackage(0, 0, 8, 1, 4, 2, false);
	
	/**
	 * Thrusters (Trait 1)
	 * Cooldown: 5
	 * 
	 * Whenever Pharah is Airborne, she stays Airborne for an additional turn.
	 */
	TraitPackage Thrusters = new TraitPackage(5);
	
	/**
	 * Barrage (Ultimate)
	 * Base Damage: 60
	 * Range: 0-5 (Straight Line 3-Wide)
	 * Hits: 3 (per turn)
	 * Accuracy: 60%
	 * Actions Consumed: 3
	 * Channeled: Yes
	 * 
	 * Pharah lets loose a barrage of mini-rockets until the end of your next turn. Any targets within
	 * a range of zero to two will receive 150% damage and Barrage has 200% accuracy against them.
	 * Each hit splashes to adjacent tiles for 25% damage. Pharah can be hurt by splash.
	 */
	UltimatePackage Barrage = new UltimatePackage(60, 0, 5, 3, 60, 3, true);
	
	public Pharah() {
		this.baseHP = 200;
		this.baseArmor = 0;
		this.baseShield = 0;
		this.actionPoints = 5;
		this.weight = 1;
		this.ultimateCount = 0;
		this.dodgeStat = 15;
		this.isAirborne = false;
	}
}
