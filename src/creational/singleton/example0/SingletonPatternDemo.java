package creational.singleton.example0;

public class SingletonPatternDemo {

	public static void main(String[] args) {

		EagerInitializedSingleton singleObject = EagerInitializedSingleton.getInstance();
		singleObject.showMessage();

	}

}
