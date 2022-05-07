package ru.job4j.condition;

public class LessThen {
    public static boolean check(int first, int second) {
        if (first < second) {
            return true;
    }
}

public static void main(String[] args) {
        boolean result  = LessThen.check(1, 3);
        System.out.println(result);
    }
}