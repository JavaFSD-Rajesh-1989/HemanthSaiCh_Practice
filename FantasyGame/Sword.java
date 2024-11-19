package UpskillingPrep.FantasyGame;

public class Sword implements Equipment{
	
	private String name;
	private int damage;
	

	public Sword(String name, int damage) {
		super();
		this.name = name;
		this.damage = damage;
	}

	@Override
	public void equip(Character character) throws Exception {
		if(!(character instanceof Warrior)) {
			throw new Exception("Only Warriors can equip swords!");
		}
		System.out.println(character.getName() + "equips the sword "+ name );
		
	}

	@Override
	public void useEquipment(Character target) {
		System.out.println("Sword slashes "+ target.getName() +" for "+ damage+ " damage!");
		target.takeDamage(damage);
	}

}
