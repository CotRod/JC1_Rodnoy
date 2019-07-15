package lection12_Exceptions;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        try {
            for (int i = 0; i < 3; i++) {
                arr[i] = i * 2;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is an exception: " + e);
        }
    }
}
