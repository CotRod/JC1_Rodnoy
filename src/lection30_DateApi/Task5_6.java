package lection30_DateApi;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.*;

public class Task5_6 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(2020, 6, 25);
        System.out.println(today.until(date, DAYS));
        System.out.println(DAYS.between(today, date)); //второй вариант

//Task6
        LocalDateTime today2 = today.atStartOfDay();
        LocalDateTime date2 = date.atStartOfDay();
        System.out.println(today2.until(date2, SECONDS));

    }
}
