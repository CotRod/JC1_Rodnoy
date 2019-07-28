package lection30_DateApi;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.ChronoField.DAY_OF_YEAR;


public class Task8 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate newYear2 = today.with(NEXT_YEAR);

        System.out.println(today.getDayOfWeek() + " " + today);
        System.out.println(newYear2.getDayOfWeek() + " " + newYear2);
    }

    private static TemporalAdjuster NEXT_YEAR = TemporalAdjusters.ofDateAdjuster(localDate -> {
        if(localDate.getDayOfYear()>182) {
            return localDate.with(DAY_OF_YEAR, 1).plusYears(1);
        }else return localDate.with(DAY_OF_YEAR,1);
    }
    );
}
