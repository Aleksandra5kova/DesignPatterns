package creational.factory.example5;

public class FactoryPatternDemo {

	public static void main(String[] args) {

		DogFactory dogFactory = new DogFactory();
		
		Dog poodle = dogFactory.getDog("poodle");
		poodle.speak();
		
		Dog rottweiler = dogFactory.getDog("rottweiler");
		rottweiler.speak();
		
		Dog siberianHusky = dogFactory.getDog("siberianhusky");
		siberianHusky.speak();
	}

}
