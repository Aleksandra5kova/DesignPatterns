package creational.abstractfactory.example4;

public class MammalFactory extends AbstractFactory {

	@Override
	public Animal getAnimal(String animal) {

		if (animal.equalsIgnoreCase("dog")) {
			return new Dog();
		} else if (animal.equalsIgnoreCase("cat")) {
			return new Cat();
		}

		throw new IllegalArgumentException("There is no such mammal");
	}

}
