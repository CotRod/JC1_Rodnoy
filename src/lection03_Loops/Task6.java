package lection03_Loops;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {


        int[][] mass1 = {
                {2, 3, 5},
                {7, 9, 11},
                {10, 15, 17}
        };
        int[][] mass2 = {
                {1, 3, 5},
                {7, 4, 11},
                {13, 15, 8}
        };

        equals(mass1, mass2);
    }

    private static void equals(int[][] mass1, int[][] mass2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый индекс");
        int a = sc.nextInt();
        System.out.println("Введите второй индекс");
        int b = sc.nextInt();

        if (mass1[a][b] == mass2[a][b]) {
            System.out.println("Элементы равны");
        } else {
            System.out.println("Элементы не равны");
        }
    }
}
