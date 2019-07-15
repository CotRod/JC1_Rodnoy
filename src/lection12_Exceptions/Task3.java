package lection12_Exceptions;

import lection12_Exceptions.objects.MyException1;

public class Task3 {
    public static void main(String[] args) {
        try {
            getExc();
        } catch (MyException1 e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    private static void getExc() throws MyException1 {
        throw new MyException1();
    }
}