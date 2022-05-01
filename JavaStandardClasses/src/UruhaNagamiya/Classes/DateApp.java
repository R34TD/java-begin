package UruhaNagamiya.Classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2021);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 12);

        Date result = calendar.getTime();
        System.out.println(result);

    }
}
