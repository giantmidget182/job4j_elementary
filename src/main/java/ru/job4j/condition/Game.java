package ru.job4j.condition;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        int win = (int) (percent * prize);
        if (win > pay && win >= 0) {
            return win - pay;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = Game.checkGame(0.9, 1, 2);
        System.out.println(result);
    }
}