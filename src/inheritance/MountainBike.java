package inheritance;

public class MountainBike extends Bicycle {

	protected int seatHeight;

	public MountainBike(int seatHeight, int gear, int speed) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}

}
