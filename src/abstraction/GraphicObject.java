package abstraction;

public abstract class GraphicObject {
	
	int x,y;
	
	public GraphicObject() {
		super();
		System.out.println("base abstract class");
	}
	
	
	void moveTo(int nexX, int newY) {
		x = nexX;
		y = newY;
		System.out.println("move to x : "+ x + " and y: " + y);
	}
	abstract void draw();
	abstract void resize();
}
