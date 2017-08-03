package creational.factory.example2;

public class SmallCar extends Car {

	@Override
	protected void construct() {
		buyParts();
		System.out.println("Constructing small car.");
	}

}
