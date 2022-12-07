import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {
//		Circle c1=new Circle(0.1,1,1);
//		Circle c2=new Circle(0.1,0.5,2);
//		Circle.setScreenSize(2);
//		System.out.print(c1);
//		c1.checkColor();
//		c2.checkColor();
//		System.out.print(c1);
//		System.out.print(c2);
//
//
//		Rectangle r1=new Rectangle(0,0,0.5,0.5);
//		Rectangle r2=new Rectangle(2,1,0.5,0.5);
//		Rectangle.setScreenSize(2);
//		System.out.print(r1);
//		r1.checkColor();
//		r2.checkColor();
//		System.out.print(r1);
//		System.out.print(r2);
//
//		StdDraw.setXscale(-Circle.getScreenSize(), Circle.getScreenSize());
//		StdDraw.setYscale(-Circle.getScreenSize(), Circle.getScreenSize());
//		c1.draw();
//		c2.draw();
//		r1.draw();
//		r2.draw();
//		Circle c3=new Circle(0.1,0.5,-2);
//		Rectangle r3=new Rectangle(-2,1,0.5,0.5);
//		c3.draw();
//		r3.draw();

//		List<Circle> circleList = new ArrayList<>();
//		Circle.setScreenSize(14);
//		StdDraw.setScale(-Shape.getScreenSize(), Shape.getScreenSize());
//		for (int i = 0; i < Shape.getScreenSize(); i += 2) {
//			circleList.add(new Circle(i, 0, -Shape.getScreenSize()));
//		}
//		Collections.sort(circleList);
//		for (int i = 0; i < circleList.size(); i++) {
//			circleList.get(i).setColor(ShapeColor.values()[i%3]);
//			circleList.get(i).draw();
//		}

//		List<Circle> circleList = new ArrayList<Circle>();
//		Shape.setScreenSize(14);
//		StdDraw.setScale(-Shape.getScreenSize(), Shape.getScreenSize());
//		for (int i = 1; i < Shape.getScreenSize(); i += 2) {
//			circleList.add(new Circle(i, 0, -Shape.getScreenSize()));
//		}
//		Collections.sort(circleList);
//		for (int i = 0; i < circleList.size(); i++) {
//			circleList.get(i).customizedColor(ColorScheme.RAINBOW, i);
//		}
		exercise1();
		//exercise4();
	}


	static void exercise1(){
		List<Circle> circleList = new ArrayList<Circle>();
		Shape.setScreenSize(9);
		StdDraw.setScale(-Shape.getScreenSize(), Shape.getScreenSize());
		for (int i = 1; i < 10; i += 2) {
			circleList.add(new Circle(i, 0, i));
		}

		Collections.sort(circleList);

		for (int i = 0; i < circleList.size(); i++) {
			circleList.get(i).customizedColor(ColorScheme.SKY, i);
		}
	}

	static void exercise4(){
		Shape.setScreenSize(9);
		StdDraw.setScale(-Shape.getScreenSize(), Shape.getScreenSize());
		new Face(0,0).draw();

		new Face(1,2).draw();
	}


}
