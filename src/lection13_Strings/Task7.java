package lection13_Strings;

import java.util.Formatter;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        long num = sc.nextLong();
        sc.close();
        long timer1 = System.nanoTime();
        String str1 = getString1(num);
        timer1 = System.nanoTime()-timer1;
        System.out.println(str1);
        System.out.println("Time: "+timer1);

        long timer2 = System.nanoTime();
        String str2 = getString2(num);
        timer2 = System.nanoTime()-timer2;
        System.out.println(str2);
        System.out.println("Time: "+timer2);

        long timer3 = System.nanoTime();
        String str3 = getString3(num);
        timer3 = System.nanoTime()-timer3;
        System.out.println(str3);
        System.out.println("Time: "+timer3);


    }
    private static String getString1(long i) {
        Formatter frmttr = new Formatter();
        frmttr.format("%010d", i);
        String frm = frmttr.toString();
        if(frm.length()>10){
            frm = "0000000000";
        }
        return frm;
    }

    private static String getString2(long i){
        String intg = ""+i;
        if(intg.length()>10){
            return "0000000000";
        }
        for (int j = intg.length();j<10;j++){
            intg = "0" + intg;
        }
        return intg;
    }
    private static String getString3(long i){
        String strBil = ""+i;
        StringBuilder stBil = new StringBuilder(strBil);
        if(strBil.length()>10){
            return "0000000000";
        }
        for(int j = stBil.length();j<10;j++){
            stBil.insert(0,'0');
        }
        return stBil.toString();
    }
}
