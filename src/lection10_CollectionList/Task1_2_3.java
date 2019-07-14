package lection10_CollectionList;

import java.util.*;

public class Task1_2_3 {

    private static final int AMOUNT_OF_STUDENTS = 10;
    private static final int NEGATIVE_MARK = 4;
    private static Random rand = new Random();

    public static void main(String[] args) {
        int maxMark = 0;
        List<Integer> marks = new ArrayList<>();
        ListIterator<Integer> iter = marks.listIterator();
        for (int i = 0; i < AMOUNT_OF_STUDENTS; i++) {
            iter.add(getRandom());
        }
        System.out.println(marks);
        while (iter.hasPrevious()) {
            int i = iter.previous();
            if (i > maxMark) {
                maxMark = i;
            }
            if (i < NEGATIVE_MARK) {
                iter.next();
                iter.remove();
            }
        }
        System.out.println(marks);
        System.out.println("Max mark: " + maxMark);
        marks.sort(Collections.reverseOrder());
        System.out.println(marks);
        Collections.shuffle(marks);
        System.out.println(marks);
        Collections.sort(marks);
        Collections.reverse(marks);
        System.out.println(marks);
    }

    private static Integer getRandom() {
        return rand.nextInt(10) + 1;
    }
}
