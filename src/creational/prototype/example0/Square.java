package creational.prototype.example0;

public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	void draw() {
		System.out.println("Drawing square...");
	}

}
