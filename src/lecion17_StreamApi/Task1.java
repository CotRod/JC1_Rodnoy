package lecion17_StreamApi;


import java.util.Arrays;
import java.util.Random;


public class Task1 {

    private static final int RANGE = 100;
    private static final int AMOUNT_OF_NUMBERS = 20;

    public static void main(String[] args) {

        Random rnd = new Random();
        int[] numbers = new int[AMOUNT_OF_NUMBERS];
        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            numbers[i] = rnd.nextInt(RANGE);
        }
        System.out.println(Arrays.toString(numbers));

        double avg = Arrays.stream(numbers)
                .filter(element -> element % 2 != 0 && element % 5 == 0)
                .peek(element -> System.out.print(element + " "))
                .average().orElse(0);

        System.out.println();
        System.out.printf("%.1f", avg);
    }
}
