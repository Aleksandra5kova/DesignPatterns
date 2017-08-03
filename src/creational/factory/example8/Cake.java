package creational.factory.example8;

public abstract class Cake {

	protected String name;
	protected String type;
	protected int price;

	protected abstract void recipe();

	public void aboutCake() {
		System.out.println("This is " + name + " Cake");
		System.out.println("Recipe: ");
		recipe();
		System.out.println("You can get a " + name + " Cake at " + price + "\n\n");
	}

}
