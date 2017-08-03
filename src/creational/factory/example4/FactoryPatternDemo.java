package creational.factory.example4;

public class FactoryPatternDemo {

	public static void main(String[] args) {

		ComputerFactory computerFactory = new ComputerFactory();

		Computer pc = computerFactory.getComputer("PC", "2GB", "500GB", "2.4GHz");
		Computer server = computerFactory.getComputer("SERVER", "16GB", "1TB", "2.9GHz");

		System.out.println(pc);
		System.out.println(server);
	}

}
