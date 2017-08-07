package creational.abstractfactory.example2;

public class WinFactory extends GUIFactory {

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WinCheckbox();
	}

}
