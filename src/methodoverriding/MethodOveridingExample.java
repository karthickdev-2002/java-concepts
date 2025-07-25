package methodoverriding;

public class MethodOveridingExample {

	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle(10);
		System.out.println(bicycle.speed);

		bicycle.applyBrake(5);
		System.out.println(bicycle.speed);

		bicycle.speedUp(10);
		System.out.println(bicycle.speed);

		Bicycle motorBike = new MotorBike(20);
		System.out.println(motorBike.speed);
		
		motorBike.applyBrake(5);
		System.out.println(motorBike.speed);

		motorBike.speedUp(10);
		System.out.println(motorBike.speed);
	}
}
