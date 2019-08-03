package jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by zbb1990 on 2019/8/3.
 */
public class DateTest {

    public static void main(String[] args) {
        LocalDate day = LocalDate.now();
        System.out.println(day);

        LocalDate localDate = day.plusDays(2);
        System.out.println(day);
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

}
