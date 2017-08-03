package creational.factory.example4;

public class ComputerFactory {

	public Computer getComputer(String computerType, String ram, String hdd, String cpu) {

		if (computerType.equalsIgnoreCase("PC")) {
			return new PC(ram, hdd, cpu);
		} else if (computerType.equalsIgnoreCase("SERVER")) {
			return new Server(ram, hdd, cpu);
		}

		throw new IllegalArgumentException("There is no such computer type.");
	}

}
