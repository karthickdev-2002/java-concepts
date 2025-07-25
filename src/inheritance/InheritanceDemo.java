package inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {

		MountainBike mountainBike = new MountainBike(10, 20, 30);

		System.out.println(mountainBike.gear);
		System.out.println(mountainBike.speed);
		System.out.println(mountainBike.seatHeight);
		
		mountainBike.applyBrake(2);
		
		System.out.println(mountainBike.speed);
	}

}
