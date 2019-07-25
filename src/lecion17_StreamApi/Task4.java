package lecion17_StreamApi;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(4);
        nums.add(2);
        nums.add(1);

        String numStr = nums.stream()
                .map(Object::toString)
                .reduce((str, elem) -> str + elem)
                .get();
        System.out.println(numStr);
    }
}
