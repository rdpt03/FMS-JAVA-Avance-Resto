package entities;

public class MainDish extends MenuItem{
	private int portionSize;
	public MainDish(String name, double price, String description, int portionSize) {
		super(name, price, description);
		this.portionSize = portionSize;
		// TODO Auto-generated constructor stub
	}
	
	
	public int getPortionSize() {
		return portionSize;
	}
	public void setPortionSize(int portionSize) {
		this.portionSize = portionSize;
	}


	@Override
	public String toString() {
		return "MainDish [MenuItem="+ super.toString()+", portionSize=" + portionSize + "]";
	}
	
	
	
	

}
