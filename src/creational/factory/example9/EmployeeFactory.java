package creational.factory.example9;

public class EmployeeFactory {

	public Employee getEmployee(int hoursAllocated, double hourlyRate) {
		if (hoursAllocated >= 40) {
			return new FullTimeEmployee(hourlyRate);
		} else {
			return new PartTimeEmployee(hourlyRate);
		}
	}

}
