package lection03_Loops;

import java.util.Scanner;

public class Task1and2 {
    public static void main(String[] args) {

        int size = 0;
        for (int a = 0; a<=100; a++){
            if(a%13==0 || a%17==0){
                size++;
            }
        }

        int [] naturalnum = new int[size];

        for (int a = 0, i = 0; a<=100; a++){
            if(a%13==0 || a%17==0){
                naturalnum [i] = a;
                i++;
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("direct or reverse: (d/r)");
        char c = sc.next().charAt(0);
        sc.close();
        if (c == 'd'){
            for (int nums:naturalnum){
                System.out.print(nums + " ");
            }
        }
        if ( c == 'r'){
            for(int a = naturalnum.length - 1; a>-1; a--)
                System.out.print(naturalnum[a] + " ");
        }
    }
}
