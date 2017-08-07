package creational.abstractfactory.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the name of the bank (HDFC, ICICI, SBI) from where you want to take loan amount: ");
		String bankName = br.readLine();

		System.out.println("Enter the type of loan (home, bussines, educational): ");
		String loanName = br.readLine();

		AbstractFactory bankFactory = FactoryCreator.getFactory("bank");
		Bank bank = bankFactory.getBank(bankName);

		System.out.println("Enter the interest rate for " + bank.getBankName() + ": ");
		double rate = Double.parseDouble(br.readLine());

		System.out.println("Enter the loan amount you want to take: ");
		double loanAmount = Double.parseDouble(br.readLine());

		System.out.println("Enter the number of years to pay your entire loan amount: ");
		int years = Integer.parseInt(br.readLine());

		System.out.println("You are taking the loan from " + bank.getBankName());

		AbstractFactory loanFactory = FactoryCreator.getFactory("loan");
		Loan loan = loanFactory.getLoan(loanName);

		loan.setInterestRate(rate);
		loan.calculateLoanPayment(loanAmount, years);

	}

}
