package creational.factory.example4;

public class Server extends Computer {

	public Server(String ram, String hdd, String cpu) {
		setRam(ram);
		setHdd(hdd);
		setCpu(cpu);
	}

	@Override
	public String toString() {
		return "Server Config: RAM=" + getRam() + ", HDD=" + getHdd() + ", CPU=" + getCpu() + ";";
	}
}
