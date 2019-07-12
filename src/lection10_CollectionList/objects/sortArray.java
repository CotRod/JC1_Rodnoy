package lection10_CollectionList.objects;

import java.util.List;
import java.util.ListIterator;

public class sortArray {
    public static void toSortArray(List<Integer> list){
        for (int i = 0, count = 0; count<list.size()-1; i++, count++) {
            if(list.get(i)<0){
                list.add(list.remove(i--));
            }
        }
    }
}
