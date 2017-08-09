package creational.prototype.example0;

public class Rectangle extends Shape {
	
	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	void draw() {
		System.out.println("Drawing rectangle...");
	}

}
