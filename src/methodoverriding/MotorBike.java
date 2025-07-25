package methodoverriding;

public class MotorBike extends Bicycle {

	public MotorBike(int speed) {
		super(speed);
	}

	public void speedUp(int increment) {
		speed += (increment + 2);
	}

	public void applyBrake(int decrement) {
		speed -= (decrement + 2);
	}

}
