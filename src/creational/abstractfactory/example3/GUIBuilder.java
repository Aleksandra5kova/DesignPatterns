package creational.abstractfactory.example3;

public class GUIBuilder {

	public static void buildWindow(AbstractFactory abstractFactory) {

		Window window = abstractFactory.createWindow();
		window.setTitle();
		window.paint();

	}

}
