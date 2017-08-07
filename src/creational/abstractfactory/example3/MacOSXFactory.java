package creational.abstractfactory.example3;

public class MacOSXFactory implements AbstractFactory {

	@Override
	public Window createWindow() {
		return new MacOSXWindow();
	}

}
