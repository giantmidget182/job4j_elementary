package ru.job4j.condition;

public class LogicAnd {
    public static boolean check(int num) {
        return num > 0 && num % 2 == 0;
    }
    
        public static void main(String[] args) {
           boolean result = LogicAnd.check(5);
            System.out.println(result);
        }
    }