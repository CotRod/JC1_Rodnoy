package lection10_CollectionList.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Stack {
    private int s;
    private List<Integer> numbers;
    private ListIterator<Integer> iter;

    public Stack(int i) {
        s = i;
        numbers = new ArrayList<>(i);
        iter = numbers.listIterator();
    }

    public void push(int i) {
        if (iter.nextIndex() < s) {
            iter.add(i);
        } else {
            System.out.println("Stack is full!!!");
        }
    }

    public Integer pull() {
        if (iter.hasPrevious()) {
            int i = iter.previousIndex();
            iter.previous();
            return numbers.remove(i);
        } else {
            System.out.println("Stack is empty");
            return 0;
        }
    }

    public void setSize(int i) {
        s = i;
        List<Integer> numbers2 = new ArrayList<>(i);
        numbers2.addAll(numbers);
        numbers = numbers2;
    }

    public void reversNum() {
        int a, b;
        while (iter.hasPrevious()) {
            b = iter.previous();
            if (iter.hasPrevious()) {
                a = iter.previous();
                if (b > a) return;
            }
        }
        while (iter.hasNext()) {
            System.out.print(iter.next());
        }
    }
}
