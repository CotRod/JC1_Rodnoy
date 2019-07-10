package lection02_Primitives;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ax^2+bx+c=0");
        System.out.println("Input a:");
        int a = sc.nextInt();
        System.out.println("Input b:");
        int b = sc.nextInt();
        System.out.println("Input c:");
        int c = sc.nextInt();
        double x1, x2;
        int d = discriminant(a, b, c);

        if(isZero(d)){
            x1=-b/2*a;
            System.out.println("Answer: x="+x1);
        }else if(isPositive(d)){
            x1=(-b + Math.sqrt(d)) / (2*a);
            x2=(-b - Math.sqrt(d)) / (2*a);
            System.out.println("Answer: x1="+x1+" x2="+x2);
        }else{
            System.out.println("There are no answers");
        }
    }

    private static boolean isPositive(int d) {
        return d>0;
    }

    private static boolean isZero(int d) {
        return d==0;
    }

    private static int discriminant(int a, int b, int c) {
        return b*b - 4*a*c;
    }
}
