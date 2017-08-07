package creational.abstractfactory.example1;

public abstract class Loan {

	protected double rate;

	abstract void setInterestRate(double rate);

	public void calculateLoanPayment(double loanamount, int years) {

		double EMI;
		int m;

		m = years * 12;
		rate = rate / 1200;
		EMI = ((rate * Math.pow((1 + rate), m)) / ((Math.pow((1 + rate), m)) - 1)) * loanamount;

		System.out.println("Your mountly EMI is " + EMI + " for the amount " + loanamount + " you have borrowed.");
	}

}
