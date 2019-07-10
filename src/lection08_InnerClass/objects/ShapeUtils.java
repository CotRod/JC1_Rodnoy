package lection08_InnerClass.objects;

public class ShapeUtils {
    public static boolean isItTriangle(Shape obj){
        if(obj.toString().equals("Triangle")){
            System.out.println("It's a Triangle");
            return true;
        }else {
            System.out.println("It's not a Triangle.");
            return false;
        }
    }

    public static boolean isItRectangle(Shape obj) {
        if(obj.toString().equals("Rectangle")){
            System.out.println("It's a Rectangle.");
            return true;
        }else {
            System.out.println("It's not a Rectangle.");
            return false;
        }
    }
}
