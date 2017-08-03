package creational.factory.example8;

public class DesignPatternDemo {

	public static void main(String[] args) {

		CakeStore cakeStore = new CakeStore();

		Cake blackForest = cakeStore.getCake("Black Forest");
		blackForest.aboutCake();

		Cake blueBerry = cakeStore.getCake("Blue Berry");
		blueBerry.aboutCake();

	}

}
