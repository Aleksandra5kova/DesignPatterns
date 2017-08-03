package creational.factory.example3;

public class DomesticPlan extends Plan {

	public DomesticPlan() {
		setRate();
	}

	@Override
	protected void setRate() {
		rate = 3.5;
	}

}
