package creational.factory.example8;

public class BlackForest extends Cake {

	public BlackForest() {
		name = "Black Forest";
		type = "Eggless";
		price = 800;
	}

	@Override
	public void recipe() {
		System.out.println("---BlackForest Recipe---");
		System.out.println("Sieve together Maida and Cocoa powder");
		System.out.println("Add Milk and Vanilla essence");
		System.out.println("Top with Whipped Cream and Cherries");
		System.out.println("Chill and Serve");
	}

}
