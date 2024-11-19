package UpskillingPrep.FantasyGame;

public class Dragon extends Character{

	public Dragon(String name, int health, int attackPower, int defence) {
		super(name, health, attackPower, defence);
	}
	
	@Override
	public void useAbility(Character target) {
		System.out.println(getName()+ " breathes fire on "+ target.getName());
		target.takeDamage(getAttackPower()+10); // Extra fire Damage
	}
	

}
