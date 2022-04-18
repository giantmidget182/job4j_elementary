package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 420;
        float expected = 6;
        float expected2 = 7;
        float out = Converter.rubleToEuro(in);
        float out2 = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        boolean passed2 = expected2 == out2;
        System.out.println("420 rubles are 2. Test result : " + passed);
        System.out.println("420 rubles are 7. Test result : " + passed2);
    }
}