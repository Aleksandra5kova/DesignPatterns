package creational.abstractfactory.example3;

public class MSWindowFactory implements AbstractFactory {

	@Override
	public Window createWindow() {
		return new MSWindow();
	}

}
