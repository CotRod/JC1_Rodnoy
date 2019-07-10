package lection02_Primitives;

import java.util.Scanner;

public class TwoHouses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First house, first side:");
        int a = sc.nextInt();
        System.out.println("First house, second side:");
        int b = sc.nextInt();
        System.out.println("Second house, first side:");
        int c = sc.nextInt();
        System.out.println("Second house, second side:");
        int d = sc.nextInt();
        System.out.println("Square, first side:");
        int e = sc.nextInt();
        System.out.println("Square, second side:");
        int f = sc.nextInt();

        if(a<=e && b<=f){
            if(e-a > f-b){
                e-=a;
            }else{
                f-=b;
            }
        }else if(a<=f && b<=e){
            if(f-a > e-b){
                f-=a;
            } else{
                e-=b;
            }
        } else {
            System.out.println("The first house is too big");
        }
        if((c<=e && d<=f) || (c<=f && d<=e)){
            System.out.println("Everything is good!");
        }else {
            System.out.println("Two houses need more place");
        }
    }
}
