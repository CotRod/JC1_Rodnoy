package lection02_Primitives;

import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input day:");
        int day = sc.nextInt();

        System.out.println("Input month(number):");
        int month = sc.nextInt();

        System.out.println("Input year:");
        int year = sc.nextInt();

        boolean endOfMonth = false;

        if (month == 2) {
            if (((year % 4 == 0) & (year % 100 != 0)) || year % 400 == 0) {
                if (day < 30) {
                    if (day == 29) endOfMonth = true;
                } else {
                    System.out.println("Date isn't correct");
                    System.exit(0);
                }
            } else {
                if (day < 29) {
                    if (day == 28) endOfMonth = true;
                } else {
                    System.out.println("Date isn't correct");
                    System.exit(0);
                }
            }
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day < 31) {
                if (day == 30) endOfMonth = true;
            } else {
                System.out.println("Date isn't correct");
                System.exit(0);
            }
        } else {
            if (day < 32) {
                if (day == 31) endOfMonth = true;
            } else {
                System.out.println("Date isn't correct");
                System.exit(0);
            }
        }
        if (endOfMonth) {
            day = 1;
            month++;
            if(month == 13){
                month=1;
                year++;
            }
        } else {
            day++;
        }
        System.out.println("Next day is:");
        System.out.println(day+"."+month+"."+year);
    }
}
