package entities;

public class Drink extends MenuItem{

	private boolean alcohol;
	private int clQuantity;
	public Drink(String name, double price, String description, boolean alcohol, int clQuantity) {
		super(name, price, description);
		this.alcohol = alcohol;
		this.clQuantity = clQuantity;
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean isAlcohol() {
		return alcohol;
	}
	public void setAlcohol(boolean alcohol) {
		this.alcohol = alcohol;
	}
	
	
	public int getClQuantity() {
		return clQuantity;
	}
	public void setClQuantity(int clQuantity) {
		this.clQuantity = clQuantity;
	}
	
	

}
