package creational.factory.example3;

public abstract class Plan {
	
	protected double rate;
	
	protected abstract void setRate();

	public double calculateBill(int units){
		return units*rate;
	}
	
}
