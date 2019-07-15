package lection12_Exceptions;

public class Task1 {
    public static void main(String[] args) {
        Integer itr = null;
        try {
            show(itr);
        } catch (NullPointerException e) {
            System.out.println("We've caught an exception : " + e);
        }
    }

    private static void show(int i) throws NullPointerException {
        System.out.println(i);
    }
}
