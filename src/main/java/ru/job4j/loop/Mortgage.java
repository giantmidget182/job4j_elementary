package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount + (amount * percent / 100) > 0) {
            amount = amount + (amount * percent / 100) - salary;
            year++;

        }
        return year;
    }
    
    public static void main(String[] args) {
        int result = Mortgage.year(100, 120, 20);
        System.out.println(result);
    }
}