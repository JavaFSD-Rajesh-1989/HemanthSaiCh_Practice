package UpskillingPrep.FantasyGame;

public class Mage extends Character{

	public Mage(String name, int health, int attackPower, int defence) {
		super(name, health, attackPower, defence);
	}
	
	@Override
	public void useAbility(Character target) {
		if(target instanceof Goblin) {
			System.out.println(getName() +" uses Arcane Blast on "+ target.getName());
			target.takeDamage(getAttackPower());// Defence bypassed
		}else {
			attack(target);
		}
	}

}
