package creational.singleton.example2;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {

	}

	// static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception ex) {
			throw new RuntimeException("Exception occured while creating singleton instance.");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}

	public void printMessage() {
		System.out.println("Hello world!");
	}
}
