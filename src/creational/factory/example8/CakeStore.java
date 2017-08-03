package creational.factory.example8;

public class CakeStore {

	public Cake getCake(String name) {
		if (name.equalsIgnoreCase("Black Forest")) {
			return new BlackForest();
		} else if (name.equalsIgnoreCase("Blue Berry")) {
			return new BlueBerry();
		}
		throw new IllegalArgumentException("There is no such cake.");
	}

}
