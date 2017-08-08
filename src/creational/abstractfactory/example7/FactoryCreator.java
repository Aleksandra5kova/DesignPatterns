package creational.abstractfactory.example7;

public class FactoryCreator {

	public static ComputerFactory getComputerInfo(String computer) {

		if (computer.equalsIgnoreCase("pc")) {
			return new PCFactory();
		} else if (computer.equalsIgnoreCase("server")) {
			return new ServerFactory();
		}

		throw new IllegalArgumentException("There is no such computer.");
	}

}
