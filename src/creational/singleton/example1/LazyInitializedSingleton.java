package creational.singleton.example1;

/**
 * The above implementation works fine incase of single threaded environment but
 * when it comes to multithreaded systems, it can cause issues if multiple
 * threads are inside the if loop at the same time. It will destroy the
 * singleton pattern and both threads will get the different instances of
 * singleton class.
 *
 */
public class LazyInitializedSingleton {

	private static LazyInitializedSingleton singleton = null;

	private LazyInitializedSingleton() {

	}

	public static LazyInitializedSingleton getInstance() {
		if (singleton == null) {
			singleton = new LazyInitializedSingleton();
		}
		return singleton;
	}

	public void printMessage() {
		System.out.println("Hello world!");
	}

}
