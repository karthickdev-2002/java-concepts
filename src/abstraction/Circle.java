package abstraction;

public class Circle extends GraphicObject {

	@Override
	void draw() {
		System.out.println("Draw circle");
		
	}

	@Override
	void resize() {
		System.out.println("Resize circle");
	}

}
