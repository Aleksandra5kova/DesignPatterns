package creational.abstractfactory.example5;

public class SeaFactory extends AnimalFactory {

	@Override
	public Animal getAnimal() {
		return new Shark();
	}

}
