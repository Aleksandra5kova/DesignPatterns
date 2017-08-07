package creational.abstractfactory.example2;

public class WinCheckbox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("Render a checkbox in Windows style.");
	}

}
