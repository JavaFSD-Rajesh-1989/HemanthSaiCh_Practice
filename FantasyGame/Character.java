package UpskillingPrep.FantasyGame;

public abstract class Character {
	
	private String name;
	private int health;
	private int attackPower;
	private int defence;
	
	
	public Character(String name, int health, int attackPower, int defence) {
		super();
		this.name = name;
		this.health = health;
		this.attackPower = attackPower;
		this.defence = defence;
	}
	
	public abstract void useAbility(Character target);
	
	public void attack(Character target) {
		target.takeDamage(attackPower);
	}
	
	public void takeDamage(int damage) {
		health -= Math.max(0, damage - defence);
		System.out.println(name + " takes "+ damage + " damage. Remaining health: "+ health);
	}
	
	public boolean isAlive() {
		return health > 0;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getAttackPower() {
		return attackPower;
	}


	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}


	public int getDefence() {
		return defence;
	}


	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	
	

}
