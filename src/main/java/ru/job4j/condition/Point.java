package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(3, 4, 5, 6);
        double result1 = Point.distance(4, 6, 2, 10);
        System.out.println("result (3, 4) to (5, 6) " + result);
        System.out.println("result1 (4, 6) to (6, 2) " + result1);
    }
}