package creational.factory.example6;

public abstract class Fruit {

	protected int price;

	protected abstract void setPrice();

	public void buyFruit(int units) {
		System.out.println("Buying " + getClass().getSimpleName() + "...");
		System.out.println("Price: " + price);
		System.out.println("Units: " + units);
		System.out.println("Total: " + price * units);
	}

}
