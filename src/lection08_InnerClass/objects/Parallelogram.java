package lection08_InnerClass.objects;

public class Parallelogram extends Rectangle {
    private Point pointTR, pointBL;
    public Parallelogram(Point p1, Point p2, Point p3, Point p4){
        super(p1,p3);
        pointTR = p2;
        pointBL = p4;
    }

    @Override
    public double getPerimeter() {
        return (super.getPointTL().distance(pointTR)+pointTR.distance(super.getPointBR()))*2;
    }

    @Override
    public String toString() {
        return "Parallelogram";
    }
}
