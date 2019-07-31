package lection17_StreamApi;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
                .collect(Collectors.joining());
        System.out.println(numStr);
    }
}
