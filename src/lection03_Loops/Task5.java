package lection03_Loops;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int i = sc.nextInt();
        int [][] butterfly;
        int centr;
        if(i%2==0){
            centr = i/2 - 1;
            butterfly = new int[i-1][i];
        }else{
            centr = i/2;
            butterfly = new int[i][i];
        }

        for(int a=0; a<butterfly.length;a++){
            if (a<=centr) {
                for (int b = 0; b < i; b++) {
                    if (b >= a && b < i - a) {
                        butterfly[a][b] = 1;
                    } else {
                        butterfly[a][b] = 0;
                    }
                }
            }
            if (a>centr) {
                centr--;
                butterfly[a] = butterfly[centr];
            }
        }
//        int [][] butterfly = {
//                {1,1,1,1,1},
//                {0,1,1,1,0},
//                {0,0,1,0,0},
//                {0,1,1,1,0},
//                {1,1,1,1,1}
//        };
        for(int[] a : butterfly){
            for(int b : a){
                if (b == 1) {
                    System.out.print("*");
                } else {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
