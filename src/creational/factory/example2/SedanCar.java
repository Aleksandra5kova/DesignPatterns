package creational.factory.example2;

public class SedanCar extends Car {

	@Override
	protected void construct() {
		buyParts();
		System.out.println("Constructing sedan car.");
	}

}
