package creational.abstractfactory.example5;

public class LandFactory extends AnimalFactory {

	@Override
	public Animal getAnimal() {
		return new Elephant();
	}

}
