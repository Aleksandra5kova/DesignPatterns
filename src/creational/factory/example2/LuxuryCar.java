package creational.factory.example2;

public class LuxuryCar extends Car {

	@Override
	protected void construct() {
		buyParts();
		System.out.println("Contructing luxury car.");
	}

}
