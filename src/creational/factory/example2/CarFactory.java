package creational.factory.example2;

public class CarFactory {

	public Car getCar(String model) {

		if (model.equalsIgnoreCase("SMALL")) {
			return new SmallCar();
		} else if (model.equalsIgnoreCase("SEDAN")) {
			return new SedanCar();
		} else if (model.equalsIgnoreCase("LUXURY")) {
			return new LuxuryCar();
		}

		throw new IllegalArgumentException("There is no such model.");
	}

}
