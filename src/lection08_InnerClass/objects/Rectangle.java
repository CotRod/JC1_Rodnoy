package lection08_InnerClass.objects;

public class Rectangle extends BaseShape {
    private Point pointTL, pointBR;
    private double side1, side2;

    public Rectangle(Point p1, Point p2) {
        pointTL = p1; // top left
        pointBR = p2; //bottom right
        side1 = pointBR.getX() - pointTL.getX();
        side2 = pointTL.getY() - pointBR.getY();
    }

    public Point getPointTL() {
        return pointTL;
    }

    public Point getPointBR() {
        return pointBR;
    }

    public double getSquare() {
        return side1 * side2;
    }


    @Override
    public String toString() {
        return "Rectangle";
    }

    @Override
    public double getPerimeter() {
        return (side1+side2)*2;
    }
}
