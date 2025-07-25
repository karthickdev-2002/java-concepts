package abstraction;

public class Rectangle extends GraphicObject {

	@Override
	void draw() {
		System.out.println("Draw circle");
		
	}

	@Override
	void resize() {
		System.out.println("Resize circle");
	}
}
