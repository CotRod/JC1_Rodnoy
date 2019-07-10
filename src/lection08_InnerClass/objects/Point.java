package lection08_InnerClass.objects;

import static java.lang.Math.*;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }


    public double distance(Point p) {
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
        return sqrt(pow(a, 2) + pow(b, 2));
    }
}
