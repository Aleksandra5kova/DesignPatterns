package creational.abstractfactory.example1;

public class FactoryCreator {

	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("bank")) {
			return new BankFactory();
		} else if (choice.equalsIgnoreCase("loan")) {
			return new LoanFactory();
		}

		throw new IllegalArgumentException("There is no such factory");
	}

}
