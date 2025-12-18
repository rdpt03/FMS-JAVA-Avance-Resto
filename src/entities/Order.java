package entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Menu> menus;

	public Order() {
		this.menus = new ArrayList<>();
	}

	
	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	public void addMenu(Menu menu) {
		this.menus.add(menu);
	}
	
	
	public double getTotal() {
		if(this.menus.size() <= 0) {
			return 0;
		}
		double total = 0;
		for(Menu menu : this.menus) {
			total+=menu.getFullMenuPrice();
		}
		return total;
	}
	
	
	@Override
	public String toString() {
		String menuVar = new String();
		for(Menu menu : this.menus) {
			menuVar += ("******Menu******\n"+
				menu.toString()+"\n\n");
		}
		return menuVar;
	}
	
}
