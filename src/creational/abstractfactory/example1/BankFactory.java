package creational.abstractfactory.example1;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {

		if (bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		} else if (bank.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		} else if (bank.equalsIgnoreCase("SBI")) {
			return new SBI();
		}

		throw new IllegalArgumentException("There is no such bank");
	}

	@Override
	public Loan getLoan(String loan) {
		throw new IllegalArgumentException("There is no such loan");
	}

}
