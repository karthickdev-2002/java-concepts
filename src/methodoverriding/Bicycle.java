package methodoverriding;

public class Bicycle {

	int speed;

	public Bicycle(int speed) {
		super();
		this.speed = speed;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}
}
