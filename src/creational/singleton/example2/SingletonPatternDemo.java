package creational.singleton.example2;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
		singleton.printMessage();
		
	}

}
