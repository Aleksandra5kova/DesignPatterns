package creational.factory.example4;

public class PC extends Computer {

	public PC(String ram, String hdd, String cpu) {
		setRam(ram);
		setHdd(hdd);
		setCpu(cpu);
	}

	@Override
	public String toString() {
		return "PC Config: RAM=" + getRam() + ", HDD=" + getHdd() + ", CPU=" + getCpu() + ";";
	}

}
