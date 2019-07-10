package lection04_Classes.Task3;

import static java.lang.Math.*;
import static java.lang.Math.pow;

public class Point {
    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }


    double distance(Point p) {
        double a;
        if (this.x < 0 || p.getX() < 0) {
            a = abs(this.x) + abs(p.getX());
        } else {
            a = abs(this.x - p.getX());
        }
        double b;
        if (this.y < 0 || p.getY() < 0) {
            b = abs(this.y) + abs(p.getY());
        } else {
            b = abs(this.y - p.getY());
        }
        double d = sqrt(pow(a, 2) + pow(b, 2));
        System.out.println("Distance = " + d);
        return d;
    }
}
