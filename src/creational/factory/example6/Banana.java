package creational.factory.example6;

public class Banana extends Fruit {

	public Banana() {
		setPrice();
	}
	
	@Override
	protected void setPrice() {
		price = 100;
	}

}
