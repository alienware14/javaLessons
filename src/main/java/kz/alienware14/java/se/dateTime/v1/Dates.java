package kz.alienware14.java.se.dateTime.v1;

import java.util.Date;

public class Dates {
    public static void main(String[] args) {

        // Объектная обертка, более удобно чем просто Long

        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis());

        date2.setTime(System.currentTimeMillis());

        System.out.println(date1);

        System.out.println("Времия и милисекундах: " + date1.getTime());
        System.out.println("Сравнение: " + date1.after(date2)); // false
        System.out.println("Еще сравнение: " + (date1.compareTo(date2) > 0)); // false
    }
}
