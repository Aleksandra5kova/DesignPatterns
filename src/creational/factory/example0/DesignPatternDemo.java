package creational.factory.example0;

public class DesignPatternDemo {

	public static void main(String[] args) {

		GenderFactory genderFactory = new GenderFactory();

		Person male = genderFactory.getPerson("male", "Ivan");
		male.sayHello();

		Person female = genderFactory.getPerson("f", "Aleksandra");
		female.sayHello();

	}

}
