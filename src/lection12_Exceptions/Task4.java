package lection12_Exceptions;

import lection12_Exceptions.objects.MyException2;

public class Task4 {
    public static void main(String[] args) {
        try {
            getExc();
        } catch (MyException2 e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    private static void getExc() throws MyException2 {
        throw new MyException2("It's my runtime exception");
    }
}
