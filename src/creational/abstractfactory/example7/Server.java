package creational.abstractfactory.example7;

public class Server extends Computer {

	public Server(String ram, String hdd, String cpu) {
		super(ram, hdd, cpu);
	}
	
	@Override
	public void printInfo() {
		System.out.println("Server Config: RAM - " + getRam() + ", HDD - " + getHdd() + ", CPU - " + getCpu());
	}

}
