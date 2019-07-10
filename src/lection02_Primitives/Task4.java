package lection02_Primitives;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input day:");
        int day = sc.nextInt();

        System.out.println("Input month(number):");
        int month = sc.nextInt();

        System.out.println("Input year:");
        int year = sc.nextInt();

        if(month == 2){
            if (((year % 4 == 0) & (year % 100 != 0)) || year % 400 == 0){
                if(day < 30){
                    System.out.println("Date is correct");
                } else {
                    System.out.println("Date isn't correct");
                }
            } else {
                if(day < 29){
                System.out.println("Date is correct");
                } else {
                System.out.println("Date isn't correct");
                }
            }
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day < 31){
                System.out.println("Date is correct");
            } else {
                System.out.println("Date isn't correct");
            }
        } else {
            if(day < 32){
                System.out.println("Date is correct");
            } else {
                System.out.println("Date isn't correct");
            }
        }
    }
}
