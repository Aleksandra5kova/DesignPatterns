package creational.factory.example8;

public class BlueBerry extends Cake {

	public BlueBerry() {
		name = "Blue Berry";
		type = "Egg";
		price = 700;
	}

	@Override
	public void recipe() {
		System.out.println("---BlueBerry Recipe---");
		System.out.println("First prepare Flour and Baking powder mixture");
		System.out.println("Add Milk and Egg yolks");
		System.out.println("Coat Berries");
		System.out.println("Bake for 50 minutes");
	}

}
