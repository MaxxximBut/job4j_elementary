package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5; /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        int result = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;  /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int result = Factorial.calc(0);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}