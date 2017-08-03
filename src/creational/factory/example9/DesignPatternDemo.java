package creational.factory.example9;

public class DesignPatternDemo {

	public static void main(String[] args) {

		EmployeeFactory employeeFactory = new EmployeeFactory();

		Employee fulltime = employeeFactory.getEmployee(40, 1500);
		fulltime.printInfo();

		Employee parttime = employeeFactory.getEmployee(20, 1000);
		parttime.printInfo();

	}

}
