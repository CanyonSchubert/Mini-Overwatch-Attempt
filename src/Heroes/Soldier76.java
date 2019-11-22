package Heroes;
import Stats.*;

public class Soldier76 extends Hero {
	
	/**
	 * Pulse Rifle (Primary)
	 * Base Damage: 20
	 * Range: 1-3
	 * Hits: 3
	 * Accuracy: 85%
	 * Actions Consumed: 3
	 * 
	 * Soldier lets loose a clip from his pulse rifle. It's range, hit count, and accuracy
	 * make up for its fairly low damage.
	 */
	WeaponPackage PulseRifle = new WeaponPackage(20, 1, 3, 3, 85, 3);
	
	/**
	 * Helix Rocket (Ability 1)
	 * Base Damage: 120
	 * Range: 0-5
	 * Hits: 1
	 * Cooldown: 4
	 * Actions Consumed: 4
	 * Channeled: No
	 * 
	 * Soldier fires a helix rocket at the target location. Enemies in adjacent tiles take 25% damage.
	 * Soldier can also be hit by the splash.
	 */
	AbilityPackage HelixRocket = new AbilityPackage(120, 0, 5, 1, 4, 4, false);
	
	/**
	 * Biotic Field (Ability 2)
	 * Base Healing: 40
	 * Range: 0-0
	 * Hits: 0
	 //* Accuracy: 100%
	 * Cooldown: 4
	 * Actions Consumed: 2
	 * Channeled: No
	 * 
	 * Soldier deploys a biotic field on the ground beneath him, turning that tile and adjacent tiles into
	 * healing tiles for the next two turns. (Healing tiles heal allies standing in them at the start of your turn.)
	 */
	AbilityPackage BioticField = new AbilityPackage(40, 0, 0, 0, 4, 2, false);
	
	/**
	 * Sprint (Trait 1)
	 * Cooldown: 1
	 * 
	 * Soldier gets 3 additional action points at the start of every turn that can only be used for movement.
	 */
	TraitPackage Sprint = new TraitPackage(1);
	
	/**
	 * Tactical Visor (Ultimate)
	 * Base Damage: 0
	 * Range: 0-0
	 * Hits: 0
	 * Accuracy: 0
	 * Actions Consumed: 1
	 * Channeled: No
	 * 
	 * Any offensive action Soldier takes for the remainder of the turn costs one action point. The range
	 * on these actions becomes 1-10 and the accuracy becomes 150%
	 */
	UltimatePackage TacticalVisor = new UltimatePackage(0, 0, 0, 0, 0, 1, false);
	
	public Soldier76() {
		this.baseHP = 200;
		this.baseArmor = 0;
		this.baseShield = 0;
		this.actionPoints = 5;
		this.weight = 1;
		this.ultimateCount = 0;
		this.dodgeStat = 10;
		this.isAirborne = false;
	}
	
}