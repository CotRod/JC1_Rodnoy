package lection10_CollectionList.objects;

import java.util.LinkedList;
import java.util.ListIterator;

import static java.lang.Integer.parseInt;

public class Stack {
    private int size;
    private LinkedList<Integer> numbers;
    private ListIterator<Integer> iter;

    public Stack(int i) {
        size = i;
        numbers = new LinkedList<>();
        iter = numbers.listIterator();
    }

    public void push(int i) {
        if (iter.nextIndex() < size) {
            iter.add(i);
        } else {
            System.out.println("Stack is full!!!");
        }
    }

    public Integer pull() {
        return numbers.pollLast();
    }

    public void setSize(int i) {
        size = i;
    }

    public int reversNum() {
        String revNum = "";
        int s = numbers.size();
        for (int i = 0; i < s; i++) {
            revNum+=numbers.pollLast();
        }
        return parseInt(revNum);
    }
}
