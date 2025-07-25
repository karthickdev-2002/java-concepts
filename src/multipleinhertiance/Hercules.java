package multipleinhertiance;

public class Hercules extends TwoWheeler implements Bicycle, Vehicle {

	int speed;
	

	public Hercules(int speed) {
		super();
		this.speed = speed;
	}

	@Override
	public void canDrive() {
		System.out.println("Hercules cycle can driven");
	}

	@Override
	public void applyBreak(int decrement) {
		speed -= decrement;
	}

	@Override
	public void speedUp(int increment) {
		speed+= increment;
	}

}
