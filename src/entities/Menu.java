package entities;

public class Menu {
	private Starter starter;
	private MainDish mainDish;
	private SideDish sideDish;
	private Drink drink;
	private Dessert dessert;
	
	
	public Menu(Starter starter, MainDish mainDish, SideDish sideDish, Drink drink, Dessert dessert) {
		this.starter = starter;
		this.mainDish = mainDish;
		this.sideDish = sideDish;
		this.drink = drink;
		this.dessert = dessert;
	}
	
	public Menu() {
		this.starter = null;
		this.mainDish = null;
		this.sideDish = null;
		this.drink = null;
		this.dessert = null;
	}
	
	
	public Starter getStarter() {
		return starter;
	}
	public void setStarter(Starter starter) {
		this.starter = starter;
	}
	
	
	public MainDish getMainDish() {
		return mainDish;
	}
	public void setMainDish(MainDish mainDish) {
		this.mainDish = mainDish;
	}
	
	
	public SideDish getSideDish() {
		return sideDish;
	}
	public void setSideDish(SideDish sideDish) {
		this.sideDish = sideDish;
	}
	
	
	public Drink getDrink() {
		return drink;
	}
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	
	
	public Dessert getDessert() {
		return dessert;
	}
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	
	public double getFullMenuPrice() {
	    double total = 0;

	    if (starter != null) total += starter.getPrice();
	    if (mainDish != null) total += mainDish.getPrice();
	    if (sideDish != null) total += sideDish.getPrice();
	    if (drink != null) total += drink.getPrice();
	    if (dessert != null) total += dessert.getPrice();

	    return total;
	}
	
	
	@Override
	public String toString() {
		return "éntree: "+this.starter.getName()+" | Prix: "+this.starter.getPrice()+"\n"+
				"Plat: "+this.mainDish.getName()+" | Prix: "+this.mainDish.getPrice()+"\n"+
				"Accompagnement: "+this.sideDish.getName()+" | Prix: "+this.sideDish.getPrice()+"\n"+
				"Boisson: "+this.drink.getName()+" | Prix: "+this.drink.getPrice()+"\n"+
				"Dessert: "+this.dessert.getName()+" | Prix: "+this.dessert.getPrice()+"\n"+
				"Prix menu: "+this.getFullMenuPrice();
	}
	
	
}
