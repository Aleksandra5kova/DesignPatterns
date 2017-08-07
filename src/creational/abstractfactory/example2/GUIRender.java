package creational.abstractfactory.example2;

public class GUIRender {

	public static void renderComponents(GUIFactory factory) {
		Button button = factory.createButton();
		button.paint();

		Checkbox checkbox = factory.createCheckbox();
		checkbox.paint();
	}

}
