package lecion17_StreamApi;

import lecion17_StreamApi.interfaces.NumsToString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(4);
        nums.add(2);
        nums.add(1);

        NumsToString nStr = (list) -> {
            Iterator<Integer> itr = list.iterator();
            StringBuilder str = new StringBuilder();
            while (itr.hasNext()) {
                str.append(itr.next());
            }
            return str.toString();
        };
        System.out.println(nStr.numStr(nums));
    }
}
