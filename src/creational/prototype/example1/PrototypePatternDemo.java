package creational.prototype.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypePatternDemo {

	public static void main(String args[]) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Employee Id: ");
		int id = Integer.parseInt(br.readLine());
		
		System.out.print("\nEnter Employee Name: ");
		String name = br.readLine();
		
		System.out.print("\nEnter Employee Designation: ");
		String designation = br.readLine();
		
		System.out.print("\nEnter Employee Address: ");
		String address = br.readLine();
		
		System.out.print("\nEnter Employee Salary: ");
		double salary = Double.parseDouble(br.readLine());
		
		System.out.println();
		
		Employee employee = new Employee(id, name, designation, address, salary);
		employee.showRecord();
		
		Employee clonedEmployee = (Employee) employee.getClone();
		clonedEmployee.showRecord();
		
	}

}
