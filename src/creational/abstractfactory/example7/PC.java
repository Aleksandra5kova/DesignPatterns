package creational.abstractfactory.example7;

public class PC extends Computer {

	public PC(String ram, String hdd, String cpu) {
		super(ram, hdd, cpu);
	}

	@Override
	public void printInfo() {
		System.out.println("PC Config: RAM - " + getRam() + ", HDD - " + getHdd() + ", CPU - " + getCpu());
	}

}
