package abstraction;

public class AbstractExample {

	public static void main(String[] args) {
		GraphicObject circle = new Circle();
		circle.draw();
		circle.resize();
		System.out.println(circle.x);
		System.out.println(circle.y);
		circle.moveTo(10, 20);
		System.out.println(circle.x);
		System.out.println(circle.y);
		
		GraphicObject rectangle = new Rectangle();
		rectangle.draw();
		rectangle.resize();
	}
}
