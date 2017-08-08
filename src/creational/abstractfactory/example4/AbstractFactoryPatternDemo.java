package creational.abstractfactory.example4;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		System.out.println("Reptiles: ");
		AbstractFactory reptileFactory = FactoryCreator.getFactory("reptile");
		
		Animal snake = reptileFactory.getAnimal("snake");
		snake.makeSound();

		Animal tyrannosaurus = reptileFactory.getAnimal("tyrannosaurus");
		tyrannosaurus.makeSound();

		System.out.println("\nMammals: ");
		AbstractFactory mammalFactory = FactoryCreator.getFactory("mammal");

		Animal dog = mammalFactory.getAnimal("dog");
		dog.makeSound();

		Animal cat = mammalFactory.getAnimal("cat");
		cat.makeSound();

	}

}
