package lection02_Primitives;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How much money do you have?");

        int money = sc.nextInt();
        int a = money % 100 / 10, b = money % 10;

        System.out.print(money + " ");

        if (a != 1) {
            switch (b) {
                case 1:
                    System.out.println("рубль");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("рубля");
                    break;
                default:
                    System.out.println("рублей");
            }
        } else {
            System.out.println("рублей");
        }
    }
}