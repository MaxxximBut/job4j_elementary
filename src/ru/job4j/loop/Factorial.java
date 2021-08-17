package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int i = result; i <= n; i++) {
            result *= i;
        }
            if (n == 0 || n == 1) {
                result = 1;
            }
           return result;
    }
}
