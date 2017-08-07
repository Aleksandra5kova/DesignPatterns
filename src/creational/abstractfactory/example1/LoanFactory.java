package creational.abstractfactory.example1;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		throw new IllegalArgumentException("There is no such bank");
	}

	@Override
	public Loan getLoan(String loan) {

		if (loan.equalsIgnoreCase("home")) {
			return new HomeLoan();
		} else if (loan.equalsIgnoreCase("education")) {
			return new EducationLoan();
		} else if (loan.equalsIgnoreCase("bussiness")) {
			return new BussinessLoan();
		}

		throw new IllegalArgumentException("There is no such loan");
	}

}
