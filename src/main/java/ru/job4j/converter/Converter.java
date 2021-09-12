package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        float in = 140f;
        float expected = 2f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are " + euro + " euros.");
        System.out.println("140 rubles are " + dollar + " dollars.");
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 140f;
        expected = 2.3333333f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2.3333333 Test result : " + passed);
    }
}