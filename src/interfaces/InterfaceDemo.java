package interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {
		MotorBike motorBike = new MotorBike(10);
		System.out.println(motorBike.speed);
		
		motorBike.applyBreak(2);
		System.out.println(motorBike.speed);
		
		motorBike.speedUp(20);
		System.out.println(motorBike.speed);
	}
}
