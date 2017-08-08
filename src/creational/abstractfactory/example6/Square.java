package creational.abstractfactory.example6;

public class Square implements Shape {

	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Drawing square with side = " + side);
	}

}
