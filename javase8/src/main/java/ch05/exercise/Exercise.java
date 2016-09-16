package ch05.exercise;

import org.junit.Test;

import java.time.LocalDate;

public class Exercise {

    // No.5
    @Test
    public void livedDays() {
        LocalDate birthday = LocalDate.of(1987, 12, 15);
        LocalDate today = LocalDate.now();
        long livedDays = today.toEpochDay() - birthday.toEpochDay();
        System.out.println(livedDays);
    }

}
