package creational.abstractfactory.example6;

public class AbstractFactoryPatternDemo {

	public static void main(String args[]) {

		FactoryCreator.getCircleFactory(10).getShape().draw();
		FactoryCreator.getSquareFactory(20).getShape().draw();
		FactoryCreator.getTriangleFactory(10, 10.5, 20).getShape().draw();

	}

}
