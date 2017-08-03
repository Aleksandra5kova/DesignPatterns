package creational.factory.example9;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(double hourlyRate) {
		setHourlyRate(hourlyRate);
	}

	public void printInfo() {
		System.out.println("This is full time employee.");
		System.out.println("His hourly rate is " + getHourlyRate() + "\n");
	}

}
