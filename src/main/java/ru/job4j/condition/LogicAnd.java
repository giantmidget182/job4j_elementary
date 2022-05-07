package ru.job4j.condition;

public class LogicAnd {
    public static boolean check(int num) {
        if (num > 0 && num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

        public static void main(String[] args) {
           boolean result = LogicAnd.check(5);
            System.out.println(result);
        }
    }