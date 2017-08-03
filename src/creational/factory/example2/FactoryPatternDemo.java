package creational.factory.example2;

public class FactoryPatternDemo {

	public static void main(String[] args) {

		CarFactory carFactory = new CarFactory();

		Car car1 = carFactory.getCar("SMALL");
		car1.construct();

		Car car2 = carFactory.getCar("SEDAN");
		car2.construct();

		Car car3 = carFactory.getCar("LUXURY");
		car3.construct();

	}

}
