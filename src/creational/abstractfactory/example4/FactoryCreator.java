package creational.abstractfactory.example4;

public class FactoryCreator {

	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("reptile")) {
			return new ReptileFactory();
		} else if (choice.equalsIgnoreCase("mammal")) {
			return new MammalFactory();
		}

		throw new IllegalArgumentException("There is no such factory");
	}

}
