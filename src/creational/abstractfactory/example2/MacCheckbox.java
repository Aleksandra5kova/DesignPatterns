package creational.abstractfactory.example2;

public class MacCheckbox implements Checkbox{

	@Override
	public void paint() {
		System.out.println("Render a checkbox in MAC OS X style.");
	}

}
