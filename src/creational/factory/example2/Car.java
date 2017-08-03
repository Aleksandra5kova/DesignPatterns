package creational.factory.example2;

public abstract class Car {
	
	protected void buyParts() {
		System.out.println("Buying parts for constructing the car.");
	}

	protected abstract void construct();

}
