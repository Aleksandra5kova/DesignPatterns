package creational.factory.example6;

public class DesignPatternDemo {
	
	public static void main(String args[]){
		
		FruitFactory fruitFactory = new FruitFactory();
		
		Fruit apple = fruitFactory.getFruit("apple");
		apple.buyFruit(10);
		
		Fruit banana = fruitFactory.getFruit("banana");
		banana.buyFruit(10);
		
		Fruit avocado = fruitFactory.getFruit("avocado");
		avocado.buyFruit(10);
	}

}
