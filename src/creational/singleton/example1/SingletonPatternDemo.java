package creational.singleton.example1;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
		singleton.printMessage();
		
	}

}
