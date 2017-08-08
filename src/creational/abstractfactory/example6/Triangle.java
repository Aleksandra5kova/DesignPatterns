package creational.abstractfactory.example6;

public class Triangle implements Shape {

	private double firstSide;
	private double secondSide;
	private double thirdSide;

	public Triangle(double firstSide, double secondSide, double thirdSide) {
		super();
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
	}

	@Override
	public void draw() {
		System.out.println("Drawing triangle with first side = " + firstSide + ", second side = " + secondSide
				+ ", third side = " + thirdSide);
	}

}
