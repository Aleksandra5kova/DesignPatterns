package creational.abstractfactory.example2;

public class MacButton implements Button {

	@Override
	public void paint() {
		System.out.println("Render a button in MAC OS X style.");
	}

}
