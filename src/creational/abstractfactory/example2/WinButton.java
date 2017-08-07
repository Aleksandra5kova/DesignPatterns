package creational.abstractfactory.example2;

public class WinButton implements Button {

	@Override
	public void paint() {
		System.out.println("Render a button in a Windows style.");
	}

}
