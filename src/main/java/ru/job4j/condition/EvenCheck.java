package ru.job4j.condition;

public class EvenCheck {
    public static boolean check(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        boolean result = EvenCheck.check(5);
        System.out.println(result);
    }
}
