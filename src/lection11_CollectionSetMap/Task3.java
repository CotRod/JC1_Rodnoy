package lection11_CollectionSetMap;

import java.util.Scanner;
import java.util.HashMap;

public class Task3 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> firstPolynomial = new HashMap<>();
        Scanner f = new Scanner(System.in);
        System.out.print("Степень многочлена n= ");
        int n = f.nextInt();

// Первый многочлен

        for (int i = n; i >= 0; i--) {
            if (i > 1) {
                System.out.print("a" + i + "*x^" + i + " + ");
                continue;
            } else if (i == 1) {
                System.out.print("a" + i + "x + ");
                continue;
            }
            System.out.print("a" + i);
        }

// Заполняем значения множителей

        System.out.println();
        for (int i = n; i >= 0; i--) {
            System.out.print("a" + i + "=");
            firstPolynomial.put(i, f.nextInt());
        }
// Выводим первый многочлен
        showPolynomial(n, firstPolynomial);

// Второй многочлен

        HashMap<Integer, Integer> secondPolynomial = new HashMap<>();
        for (int i = n; i >= 0; i--) {
            if (i > 1) {
                System.out.print("b" + i + "*x^" + i + " + ");
                continue;
            } else if (i == 1) {
                System.out.print("b" + i + "x + ");
                continue;
            }
            System.out.print("b" + i);
        }

// Заполняем значения множителей

        System.out.println();
        for (int i = n; i >= 0; i--) {
            System.out.print("b" + i + "=");
            secondPolynomial.put(i, f.nextInt());
        }

// Выводим второй многочлен
        showPolynomial(n, secondPolynomial);

// Складываем
        HashMap<Integer, Integer> resultPolynomial = new HashMap<>();
        for (int i = n; i >= 0; i--) {
            resultPolynomial.put(i, firstPolynomial.get(i) + secondPolynomial.get(i));
        }

// Выводим результат
        showPolynomial(n, resultPolynomial);
    }

    private static void showPolynomial(int n, HashMap<Integer, Integer> polynomial) {
        for (int i = n; i >= 0; i--) {
            if (i > 1) {
                System.out.print(polynomial.get(i) + "x^" + i + " + ");
                continue;
            } else if (i == 1) {
                System.out.print(polynomial.get(i) + "x + ");
                continue;
            }
            System.out.println(polynomial.get(i));
        }
        System.out.println();
    }
}

