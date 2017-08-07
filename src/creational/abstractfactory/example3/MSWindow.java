package creational.abstractfactory.example3;

public class MSWindow implements Window {

	@Override
	public void setTitle() {
		System.out.println("MSWindow");
	}

	@Override
	public void paint() {
		System.out.println("Painting the MSWindow...");
	}

}
