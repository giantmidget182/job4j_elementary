package ru.job4j.condition;

public class EvenCheck {
    public static boolean check(int num) {
        if (num % 2 == 0) {
            return true;
        }
    }

    public static void main(String[] args) {
        boolean result = EvenCheck.check(5);
        System.out.println(result);
    }
}
