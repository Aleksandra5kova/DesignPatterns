package creational.abstractfactory.example2;

public class MacFactory extends GUIFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}

}
