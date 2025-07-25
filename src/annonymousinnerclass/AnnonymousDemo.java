package annonymousinnerclass;

public class AnnonymousDemo {

	public static void main(String[] args) {
		Bicycle mountainBike = new MountainBike();
		mountainBike.canApplyBreak();
		mountainBike.canSpeedUp();

		// Annonymous inner class
		Bicycle bicycle = new Bicycle() {

			@Override
			public void canSpeedUp() {
				System.out.println("Can speed up annonymous");
			}

			@Override
			public void canApplyBreak() {
				System.out.println("Can apply break annonymous");
			}
		};

		bicycle.canApplyBreak();
		bicycle.canSpeedUp();
	}

}
