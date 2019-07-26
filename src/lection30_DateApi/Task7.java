package lection30_DateApi;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;

import static java.time.temporal.ChronoUnit.DAYS;

public class Task7 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        TemporalAdjuster temporalAdjuster = temporal -> temporal.plus(42, DAYS);

        System.out.println(today.with(temporalAdjuster));
    }
}
