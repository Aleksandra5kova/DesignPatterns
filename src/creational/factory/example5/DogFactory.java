package creational.factory.example5;

public class DogFactory {

	public Dog getDog(String dog) {

		if (dog.equalsIgnoreCase("poodle")) {
			return new Poodle();
		} else if (dog.equalsIgnoreCase("rottweiler")) {
			return new Rottweiler();
		} else if (dog.equalsIgnoreCase("siberianhusky")) {
			return new SiberianHusky();
		}
		throw new IllegalArgumentException("There is no such dog.");
	}

}
