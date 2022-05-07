package ru.job4j.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        boolean rsl;
        if (year % 400 == 0) {
         rsl = true;
        } else if (year % 100 == 0) {
            rsl = false;
        } else {
            rsl = year % 4 == 0;
        }
        return rsl;
    }

    public static void main(String[] args) {
        boolean rsl = LeapYear.checkYear(2020);
        System.out.println(rsl);
    }
}
