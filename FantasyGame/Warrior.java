package UpskillingPrep.FantasyGame;

public class Warrior extends Character{

	public Warrior(String name, int health, int attackPower, int defence) {
		super(name, health, attackPower, defence);
	}
	
	@Override
	public void useAbility(Character target) {
		if(target instanceof Dragon) {
			target.takeDamage(getAttackPower()*2);
			System.out.println(getName() +" uses Dragon Slayer ability on "+ target.getName());
			
		}else {
			attack(target);
		}
	}
	
	

}
