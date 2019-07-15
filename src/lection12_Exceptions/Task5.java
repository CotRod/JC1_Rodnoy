package lection12_Exceptions;

import lection12_Exceptions.objects.MyException2;

public class Task5 {
    public static void main(String[] args) {
        Integer i = null;
        try {
            getExc(i);
        }catch (NullPointerException e){
            try {
                throw new MyException2("It's not my fault",e);
            }catch (MyException2 e2){
                e2.printStackTrace();
                System.out.println(e2.getHiddenException());
            }
        }
    }
    private static void getExc(int i) throws NullPointerException{
        System.out.println(i);
    }
}
