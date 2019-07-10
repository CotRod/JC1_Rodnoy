package lection08_InnerClass.objects;

import static java.lang.Math.PI;

public class Circle extends BaseShape{
    private double radius;

    public Circle(Point p1, Point p2){
        radius = p1.distance(p2);
    }

    @Override
    public double getPerimeter() {
        return PI*radius*2;
    }

    @Override
    public double getSquare() {
        return PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
