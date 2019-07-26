package lection30_DateApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }
}
