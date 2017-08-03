package creational.factory.example7;

public class CurrencyFactory {

	public Currency getCurrency(String country) {
		if (country.equalsIgnoreCase("Macedonia")) {
			return new Denar();
		} else if (country.equalsIgnoreCase("Serbia")) {
			return new Dinar();
		} else if (country.equalsIgnoreCase("Bulgaria")) {
			return new Lev();
		}
		throw new IllegalArgumentException("No such currency");
	}

}
