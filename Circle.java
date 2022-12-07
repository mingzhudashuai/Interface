import java.awt.*;

public class Circle extends Shape  implements Comparable<Circle>,ColorDraw{
    private double radius;//圆形独有的属性
    static final int DEFAULT_RADIUS = 5;//圆形独有的属性


    public Circle(double radius, double x, double y) {
        super(x, y);
        this.radius = radius;
    }

    public Circle(double radius) {
        super(0, 0);
        this.radius = radius;
    }

    public Circle(double x, double y) {
        super(x, y);
        this.radius = DEFAULT_RADIUS;
    }


    public void checkColor() {
        if (isInBoundary()) {
            super.setColor(ShapeColor.GREEN);
        } else {
            super.setColor(ShapeColor.RED);
        }
    }

    public boolean isInBoundary() {
        if (-1 * Shape.getScreenSize() > super.getX() - this.radius || Shape.getScreenSize() < super.getX() + this.radius) {
            return false;
        }
        if (-1 * Shape.getScreenSize() > super.getY() - this.radius || Shape.getScreenSize() < super.getY() + this.radius) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" +
                super.toString() +
                "}\n";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void draw() {

        StdDraw.setPenColor(super.getColor().getColor());
        StdDraw.filledCircle(super.getX(), super.getY(), radius);

    }

    @Override
    public int compareTo(Circle o) {
        if(this.radius < o.radius){
            return 1;
        }else if(this.radius > o.radius){
            return -1;
        }
        return 0;
    }

    @Override
    public void customizedColor(ColorScheme colorScheme, int index) {
        Color[] colorList = colorScheme.getColorScheme();
        if (index < 0){
            index = 0;
        }
        if (index >= colorList.length){
            index = index % colorList.length;
        }
        StdDraw.setPenColor(colorList[index]);
        StdDraw.filledCircle(getX(), getY(), radius);
    }
}
