package lection02_Primitives;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input year:");

        int year = sc.nextInt();

        if (((year % 4 == 0) & (year % 100 != 0)) || year % 400 == 0){
            System.out.println( year + " - it's a leap year ");
        } else {
            System.out.println(year + " - it's not a leap year");
        }
    }
}