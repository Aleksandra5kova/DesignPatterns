package creational.prototype.example0;

public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}
	
	@Override
	void draw() {
		System.out.println("Drawing circle...");
	}

}
