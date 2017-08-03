package creational.factory.example9;

public class PartTimeEmployee extends Employee {

	public PartTimeEmployee(double hourlyRate) {
		setHourlyRate(hourlyRate);
	}

	@Override
	public void printInfo() {
		System.out.println("This is part time employee.");
		System.out.println("His hourly rate is " + getHourlyRate() + "\n");
	}

}
