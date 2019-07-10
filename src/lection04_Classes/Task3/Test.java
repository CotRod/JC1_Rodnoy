package lection04_Classes.Task3;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(2, 4);
        Point point2 = new Point(7, 2);
        System.out.println(point1.distance(point2));

        Rectangle rectngl = new Rectangle(point1, point2);

        System.out.println("Square " + rectngl.getSquare());
        System.out.println("Daigonal " + rectngl.diagonal());
    }
}
