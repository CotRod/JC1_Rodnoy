package lection08_InnerClass;

import lection08_InnerClass.objects.*;

import static lection08_InnerClass.objects.ShapeUtils.isItRectangle;
import static lection08_InnerClass.objects.ShapeUtils.isItTriangle;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(2,6);
        Point p2 = new Point(10,6);
        Point p3 = new Point(10,2);
        Point p4 = new Point(0,2);
        Point p5 = new Point (12,6);
        //Triangle
        Shape test = new Triangle(p1,p2,p3);
        System.out.println(test);
        System.out.println(isItTriangle(test));
        System.out.println("Square "+ test.getSquare()+ "\nPerimeter" + test.getPerimeter());
        System.out.println("High " + ((Triangle) test).getHigh());
        //Rectangle
        test = new Rectangle(p1,p3);
        System.out.println(test);
        System.out.println(isItRectangle(test));
        System.out.println("Square "+ test.getSquare()+ "\nPerimeter" + test.getPerimeter());
        //Parallelogram
        test = new Parallelogram(p1,p5,p3,p4);
        System.out.println(test);
        System.out.println(isItRectangle(test));
        System.out.println("Square "+ test.getSquare()+ "\nPerimeter" + test.getPerimeter());
        //Circle
        Shape test2 = new Circle(p2,p5);
        System.out.println(test2);
        System.out.println(isItTriangle(test2));
        System.out.println("Square "+ test2.getSquare()+ "\nPerimeter" + test2.getPerimeter());

        test.equals(test2);
    }
}
