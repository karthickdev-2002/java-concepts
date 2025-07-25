package multipleinhertiance;

public class MultipleInheritanceExample {

	public static void main(String[] args) {
		Hercules hercules = new Hercules(10);
		
		System.out.println(hercules.speed);
		
		hercules.applyBreak(5);
		System.out.println(hercules.speed);
		
		hercules.speedUp(5);
		System.out.println(hercules.speed);
		
		hercules.canDrive();
		
		hercules.rotateWheels();
	}
}
