package lection08_InnerClass.objects;

abstract class BaseShape implements Shape {


    abstract public double getSquare();


    public void equals(Shape obj) {
        if (this.getSquare() > obj.getSquare()) {
            System.out.println("This " + this + "'s square is bigger than " + obj + "'s square");
        } else if (this.getSquare() < obj.getSquare()) {
            System.out.println("This " + this + "'s square is smaller than " + obj + "'s square");
        } else {
            System.out.println("This " + this + "'s square is equals " + obj + "'s square");
        }
    }

    @Override
    abstract public String toString();

    abstract public double getPerimeter();
}
