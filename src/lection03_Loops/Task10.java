package lection03_Loops;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        long fctrl = 1;

        if(num == 0){
            System.out.println("Factorial of 0 is 1 !!!");
            System.exit(0);
        }
        if(num>20){
            System.out.println("It's too hard for me. Sorry :(");
            System.exit(0);
        }
        for (int i = 1; i<=num; i++){
            fctrl*=i;
        }
        System.out.println("Factorial is "+ fctrl);

        fctrl = 1;
        int b = 1;
        while(b <= num){
            fctrl*=b;
            b++;
        }
        System.out.println("Yes! Factorial of " + num + " is " + fctrl);
    }
}
