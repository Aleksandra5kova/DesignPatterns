package creational.factory.example6;

public class FruitFactory {

	public Fruit getFruit(String fruitName) {
		if (fruitName.equalsIgnoreCase("APPLE")) {
			return new Apple();
		} else if (fruitName.equalsIgnoreCase("BANANA")) {
			return new Banana();
		} else if (fruitName.equalsIgnoreCase("AVOCADO")) {
			return new Avocado();
		}
		throw new IllegalArgumentException("There is no such fruit.");
	}

}
