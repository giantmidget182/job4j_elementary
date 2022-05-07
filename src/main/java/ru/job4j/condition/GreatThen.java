package ru.job4j.condition;

public class GreatThen {
    public static boolean check(int first, int second) {
        return first < second;
    }

    public static void main(String[] args) {
        boolean result  = GreatThen.check(1, 3);
        System.out.println(result);
    }
}