package lection04_Classes.Task2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity of twenty-dollar bills");
        int t = sc.nextInt();
        System.out.println("Enter quantity of fifty-dollar bills");
        int f = sc.nextInt();
        System.out.println("Enter quantity of hundred-dollar bills");
        int h = sc.nextInt();

        CashMachine atm = new CashMachine(t, f, h);
        atm.start();
        sc.close();
    }
}
