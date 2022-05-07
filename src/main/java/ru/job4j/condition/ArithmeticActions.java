package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String result;
        if (left + right == rsl) {
            result = "added";
        } else if (left - right == rsl) {
           result = "subtracted";
        } else if (left * right == rsl) {
            result = "multiplied";
        } else if (left / right == rsl) {
            result = "divided";
        } else {
            result = "none";
        }
        return result;
    }

    public static void main(String[] args) {
        String result = ArithmeticActions.selectAction(1, 10, 100);
        System.out.println(result);
    }
}