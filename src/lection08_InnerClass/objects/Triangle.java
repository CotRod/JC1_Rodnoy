package lection08_InnerClass.objects;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Triangle extends BaseShape {
    Point point1, point2, point3;
    private double sPrmtr, Prmtr, side1, side2,side3;

    public Triangle(Point p1, Point p2, Point p3) {
        point1 = p1;
        point2 = p2;
        point3 = p3;
        side1 = point1.distance(point2);
        side2 = point2.distance(point3);
        side3 = point3.distance(point1);
        Prmtr = side1 + side2 + side3;
        sPrmtr = Prmtr / 2;
    }


    public double getSquare() {
        return sqrt(sPrmtr * (sPrmtr - side1) * (sPrmtr - side2) * (sPrmtr - side3));
    }


    public double getHigh() {
        System.out.println("High to which side do you want? 1/2/3"); // Выбираем сторону, высоту к которой будем узнавать
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        double side;
        if (ch == 1) {
            side = side1;
        } else if (ch == 2) {
            side = side2;
        } else {
            side = side3;
        }
        return (2 * sqrt(sPrmtr * (sPrmtr - side1) * (sPrmtr - side2) * (sPrmtr - side3))) / side;
    }

    @Override
    public String toString() {
        return "Triangle";
    }

    @Override
    public double getPerimeter() {
        return Prmtr;
    }
}
