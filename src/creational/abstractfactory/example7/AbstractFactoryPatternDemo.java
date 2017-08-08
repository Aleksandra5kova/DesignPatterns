package creational.abstractfactory.example7;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		ComputerFactory pcFactory = FactoryCreator.getComputerInfo("pc");
		Computer pc = pcFactory.getComputer("2GB", "500GB", "2.4Hz");
		pc.printInfo();

		ComputerFactory serverFactory = FactoryCreator.getComputerInfo("server");
		Computer server = serverFactory.getComputer("16GB", "1TB", "2.9Hz");
		server.printInfo();

	}

}
