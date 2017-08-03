package creational.factory.example7;

public class DesignPatternDemo {

	public static void main(String[] args) {
		
		CurrencyFactory currencyFactory = new CurrencyFactory();
		
		Currency c1 = currencyFactory.getCurrency("Macedonia");
		c1.printCurrencyInfo();
		
		Currency c2 = currencyFactory.getCurrency("Serbia");
		c2.printCurrencyInfo();
		
		Currency c3 = currencyFactory.getCurrency("Bulgaria");
		c3.printCurrencyInfo();
	}

}
