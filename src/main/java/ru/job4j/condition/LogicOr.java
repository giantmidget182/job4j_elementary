package ru.job4j.condition;

public class LogicOr {
    public static boolean check(int num) {
        if (num < 0 || num % 2 != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = LogicOr.check(-4);
        System.out.println(result);
    }
}