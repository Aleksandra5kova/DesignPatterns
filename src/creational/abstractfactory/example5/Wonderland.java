package creational.abstractfactory.example5;

public class Wonderland {

	public Wonderland(AnimalFactory factory) {
		factory.getAnimal().breathe();
	}

}
