package lection12_Exceptions;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        try {
            getExc(rnd.nextInt(3));
        }catch (NullPointerException e){
            System.out.println("It's NullPointerException");
            System.out.println(e);
        } catch (NegativeArraySizeException e){
            System.out.println("It's NegativeArraySizeException");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("It's ArrayIndexOutOfBoundsException");
            System.out.println(e);
        }
    }

    private static void getExc(int i) throws NullPointerException,NegativeArraySizeException,ArrayIndexOutOfBoundsException{
        switch (i){
            case 0: throw new NullPointerException();
            case 1: throw new NegativeArraySizeException();
            case 2: throw new ArrayIndexOutOfBoundsException();
        }
    }

}
