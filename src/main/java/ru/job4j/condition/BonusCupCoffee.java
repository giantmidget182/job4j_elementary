package ru.job4j.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        if (count % n == 0) {
            return count + (count / n);
        } else {
            return count + (count / n);
        }
    }

    public static void main(String[] args) {
        int result = BonusCupCoffee.countCup(213, 6);
        System.out.println(result);
    }
}