package lesson1;

import java.time.LocalDate;

import java.time.temporal.TemporalAdjusters;

/**
 * Created by User on 26.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate payday = today.with(TemporalAdjusters.lastDayOfMonth()).plusDays(2);
        System.out.println(payday);
    }
}
