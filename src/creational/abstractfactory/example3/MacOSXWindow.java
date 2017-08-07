package creational.abstractfactory.example3;

public class MacOSXWindow implements Window {

	@Override
	public void setTitle() {
		System.out.println("MacOSXWindow");
	}

	@Override
	public void paint() {
		System.out.println("Painting the MacOSXWindow...");
	}

}
