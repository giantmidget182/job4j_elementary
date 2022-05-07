package ru.job4j.condition;

public class OddCheck {
    public static boolean check(int num) {
        switch (num % 2) {
            case 0:
                return;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = OddCheck.check(5);
        System.out.println(result);
    }
}