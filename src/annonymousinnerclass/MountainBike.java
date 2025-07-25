package annonymousinnerclass;


public class MountainBike implements Bicycle {

	@Override
	public void canSpeedUp() {
		System.out.println("Can speed up");
		
	}

	@Override
	public void canApplyBreak() {
		System.out.println("Can apply break");
	}

}
