package inheritance;

public class Bicycle {

	protected int gear;
	protected int speed;

	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

}
