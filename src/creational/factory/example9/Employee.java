package creational.factory.example9;

public abstract class Employee {

	private double hourlyRate;

	protected double getHourlyRate() {
		return hourlyRate;
	}

	protected void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public abstract void printInfo();
}
