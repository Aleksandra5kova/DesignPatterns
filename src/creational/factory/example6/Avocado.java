package creational.factory.example6;

public class Avocado extends Fruit {

	public Avocado() {
		setPrice();
	}
	
	@Override
	protected void setPrice() {
		price = 120;
	}

}
