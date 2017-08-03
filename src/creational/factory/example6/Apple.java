package creational.factory.example6;

public class Apple extends Fruit {

	public Apple() {
		setPrice();
	}
	
	@Override
	protected void setPrice() {
		price = 80;
	}

}
