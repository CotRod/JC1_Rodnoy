package lection10_CollectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static lection10_CollectionList.objects.sortArray.toSortArray;

public class Task7 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            list.add(rand.nextInt(20)-10);
        }
        System.out.println(list);
        toSortArray(list);
        System.out.println(list);
    }
}
