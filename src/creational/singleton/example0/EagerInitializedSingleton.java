package creational.singleton.example0;

/**
 * In eager initialization, the instance of Singleton Class is created at the
 * time of class loading, this is the easiest method to create a singleton class
 * but it has a drawback that instance is created even though client application
 * might not be using it.
 *
 */
public class EagerInitializedSingleton {

	private static EagerInitializedSingleton singleObject = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {

	}

	public static EagerInitializedSingleton getInstance() {
		return singleObject;
	}

	public void showMessage() {
		System.out.println("Hello world!");
	}

}
