package creational.abstractfactory.example7;

public class PCFactory extends ComputerFactory {

	@Override
	public Computer getComputer(String ram, String hdd, String cpu) {
		return new PC(ram, hdd, cpu);
	}

}
