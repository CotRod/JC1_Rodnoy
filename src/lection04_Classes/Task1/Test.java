package lection04_Classes.Task1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to input seconds (1) or time(2)?");
        int choice = sc.nextInt();
        Time time;
        if (choice==1){
            System.out.println("Input seconds...");
            time = new Time(sc.nextInt());
        }else{
            System.out.println("Input hours...");
            int h = sc.nextInt();
            System.out.println("Input minutes...");
            int m = sc.nextInt();
            System.out.println("Input seconds...");
            int s = sc.nextInt();
            time = new Time(h,m,s);
        }
        System.out.println("What do you want to get seconds (1) or time(2)?");
        choice=sc.nextInt();
        if (choice==1){
            System.out.println(time.getSeconds());
        }else{
            time.getTime();
        }
    }
}
