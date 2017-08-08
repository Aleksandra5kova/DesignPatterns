package creational.abstractfactory.example7;

public class ServerFactory extends ComputerFactory {

	@Override
	public Computer getComputer(String ram, String hdd, String cpu) {
		return new Server(ram, hdd, cpu);
	}

}
