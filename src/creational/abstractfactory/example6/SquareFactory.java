package creational.abstractfactory.example6;

public class SquareFactory extends ShapeFactory {

	private double side;

	public SquareFactory(double side) {
		super();
		this.side = side;
	}

	@Override
	public Shape getShape() {
		return new Square(side);
	}

}
