package creational.factory.example1;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		
		throw new IllegalArgumentException("There is no such shape type.");
	}

}
