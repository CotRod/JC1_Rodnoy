package lection03_Loops;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        if(num<2){
            System.out.println("Ops, something's gone wrong. Try again");
        } else if(num == 2){
            System.out.println("2 is a prime number");
        } else{
            for (int i = 2; i<num; i++){
                if(num%i==0){
                    System.out.println("It's a natural number");
                    break;
                }
                if(i>num/2){
                    System.out.println("It's a prime number");
                    break;
                }
            }
        }
    }
}
