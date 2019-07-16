package lection10_CollectionList;

import lection10_CollectionList.objects.Stack;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Set a size of a Stack");
        Stack stack = new Stack(sc.nextInt());
        System.out.println("Input a Number");
        int num = sc.nextInt();
        char[] numbers = Integer.toString(num).toCharArray();
        for (char i : numbers) {
            stack.push(Character.getNumericValue(i));
        }
        System.out.println(stack.reversNum());
    }
}
