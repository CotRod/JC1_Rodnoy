package lection11_CollectionSetMap;

import java.util.Scanner;
import java.util.HashMap;

public class Task3 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> d = new HashMap<Integer, Integer>();
        Scanner f = new Scanner(System.in);
        System.out.print("Степень многочлена n= ");
        int n = f.nextInt();
        System.out.print("D(x)= c0 ");
        for (int i = 1; i <= n; i++) {
            System.out.print(" + c" + i + "*x^" + i);
        }
        System.out.println();
        for (int i = 0; i <= n; i++) {
            System.out.print("c" + i + "=");
            d.put(i, f.nextInt());
        }
        System.out.print("D(x)= " + d.get(0));
        for (int i = 1; i <= n; i++) {
            System.out.print(" + " + d.get(i) + "x^" + i);
        }
        System.out.println();
        HashMap<Integer, Integer> e = new HashMap<Integer, Integer>();
        System.out.print("E(x)= a0 ");
        for (int i = 1; i <= n; i++) {
            System.out.print(" + a" + i + "*x^" + i);
        }
        System.out.println();
        for (int i = 0; i <= n; i++) {
            System.out.print("a" + i + "=");
            e.put(i, f.nextInt());
        }
        System.out.print("E(x)= " + e.get(0));
        for (int i = 1; i <= n; i++) {
            System.out.print(" + " + e.get(i) + "x^" + i);
        }
        System.out.println();
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        h.put(0, d.get(0) + e.get(0));
        System.out.print("D(x)+E(x)= " + h.get(0));
        for (int i = 1; i <= n; i++) {
            h.put(i, d.get(i) + e.get(i));
            System.out.print(" + " + h.get(i) + "x^" + i);
        }
    }
}

