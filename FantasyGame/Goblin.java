package UpskillingPrep.FantasyGame;

public class Goblin extends Character{

	public Goblin(String name, int health, int attackPower, int defence) {
		super(name, health, attackPower, defence);
	}
	
	@Override
	public void useAbility(Character target) {
		System.out.println(getName()+ " performs a sneaky attack on "+ target.getName());
		target.takeDamage(getAttackPower());
	}

}
