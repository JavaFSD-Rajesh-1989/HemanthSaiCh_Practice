package UpskillingPrep.FantasyGame;

import java.util.*;

public class Inventory<T extends Equipment> {
	private List<T> items = new ArrayList<>();
	
	public void addItem(T item) {
		items.add(item);
	}
	
	public void useItem(int index, Character target) {
		if(index < items.size()) {
			items.get(index).useEquipment(target);
		}else {
			System.out.println("Invalid inventory index !");
		}
	}

}
