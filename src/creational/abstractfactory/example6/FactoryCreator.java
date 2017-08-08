package creational.abstractfactory.example6;

public class FactoryCreator {

	public static ShapeFactory getCircleFactory(double radius) {
		return new CircleFactory(radius);
	}

	public static ShapeFactory getSquareFactory(double side) {
		return new SquareFactory(side);
	}

	public static ShapeFactory getTriangleFactory(double firstSide, double secondSide, double thirdSide) {
		return new TriangleFactory(firstSide, secondSide, thirdSide);
	}
}
