package lection04_Classes.Task3;

public class Rectangle {
    private Point point1, point2;
    double side1;
    double side2;

    public Rectangle(Point p1, Point p2) {
        // top left
        point1 = p1;
        //bottom right
        point2 = p2;
        side1 = point2.getX() - point1.getX();
        side2 = point1.getY() - point2.getY();
    }


    double getSquare() {
        return side1 * side2;
    }

    double diagonal() {
        return point1.distance(point2);
    }
}
