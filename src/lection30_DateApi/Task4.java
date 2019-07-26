package lection30_DateApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task4 {
    public static void main(String[] args) {
        String d = "26-04-2014";
        LocalDate date = LocalDate.parse(d, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(date);
    }
}
