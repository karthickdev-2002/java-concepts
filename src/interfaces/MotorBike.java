package interfaces;

public class MotorBike implements Bicycle {

	int speed;

	public MotorBike(int speed) {
		super();
		this.speed = speed;
	}

	@Override
	public void applyBreak(int decrement) {
		speed -= decrement;
	}

	@Override
	public void speedUp(int increment) {
		speed += increment;
	}

}
