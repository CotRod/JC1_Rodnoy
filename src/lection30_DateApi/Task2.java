package lection30_DateApi;

import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate afterThreeMonths = today.plusMonths(3);
        System.out.println(afterThreeMonths);
    }
}
