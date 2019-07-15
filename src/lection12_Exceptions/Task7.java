package lection12_Exceptions;

import lection12_Exceptions.objects.MyException1;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        try {
            getExcpt();
        }catch (MyException1 e){
            System.out.println("It's a catch block");
            e.printStackTrace();
        } finally {
            System.out.println("It's a finally block");
        }
    }

    private static void getExcpt() throws MyException1{
        Random rnd = new Random();
        if(rnd.nextInt(2)==0){
            throw new MyException1();
        }
        System.out.println("Without an exception");
    }
}
