package creational.abstractfactory.example5;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		new Wonderland(new SeaFactory());

		new Wonderland(new LandFactory());
	}

}
