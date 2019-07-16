package lecion17_StreamApi;

import lecion17_StreamApi.interfaces.CountAvg;


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
        CountAvg avgNum = (n) -> {
            int sum = 0;
            int count = 0;
            for (int value : n) {
                if (value % 2 != 0 && value % 5 == 0) {
                    sum += value;
                    count++;
                    System.out.print(value + " ");
                }
            }
            if (count == 0) {
                return 0;
            } else {
                return sum / count;
            }
        };
        double avg = avgNum.cntAvg(numbers);
        System.out.println();
        System.out.println(avg);
    }
}
