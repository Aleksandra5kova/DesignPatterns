package creational.abstractfactory.example4;

public class ReptileFactory extends AbstractFactory {

	@Override
	public Animal getAnimal(String animal) {

		if (animal.equalsIgnoreCase("snake")) {
			return new Snake();
		} else if (animal.equalsIgnoreCase("tyrannosaurus")) {
			return new Tyrannosaurus();
		}

		throw new IllegalArgumentException("There is no such reptile");
	}

}
