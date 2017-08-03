package creational.factory.example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryPatternDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PlanFactory planFactory = new PlanFactory();
		
		System.out.println("Enter the name for which the bill will be generated: ");
		String planName = br.readLine();
		
		System.out.println("Enter the number of units for bill: ");
		int units = Integer.parseInt(br.readLine());
		
		Plan plan = planFactory.getPlan(planName);
		System.out.println("Bill amount for " + planName.toLowerCase() + " of " + units + " is: " + plan.calculateBill(units));
		
		
	}

}
