package creational.abstractfactory.example6;

public class TriangleFactory extends ShapeFactory {

	private double firstSide;
	private double secondSide;
	private double thirdSide;

	public TriangleFactory(double firstSide, double secondSide, double thirdSide) {
		super();
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
	}

	@Override
	public Shape getShape() {
		return new Triangle(firstSide, secondSide, thirdSide);
	}

}
