package creational.abstractfactory.example6;

public class CircleFactory extends ShapeFactory {

	private double radius;
	
	public CircleFactory(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public Shape getShape() {
		return new Circle(radius);
	}

}
