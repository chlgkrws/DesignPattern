package creational.FactoryMethod;

public class FactoryPatternTest {
	
	public static void main(String args[]) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
	}
}
