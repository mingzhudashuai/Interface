import java.awt.*;

public class Face extends Shape{
    public Face(double x, double y) {
        super(x, y);
        profile = new Rectangle(x,y,5,5);
        profile.setColor(ShapeColor.GRAY);
        leftEye = new Circle(1,super.getX()-1.5, super.getY()+1);
        rightEye = new Circle(1,super.getX()+1.5, super.getY()+1);
        leftEye.setColor(ShapeColor.RED);
        rightEye.setColor(ShapeColor.RED);

    }

    private Rectangle profile;
    private Circle leftEye;
    private Circle rightEye;

    public void draw() {
        //super: Shape class
        profile.draw();
        rightEye.draw();
        leftEye.draw();
    }
}
