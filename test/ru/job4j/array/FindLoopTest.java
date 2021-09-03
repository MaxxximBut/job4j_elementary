package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenArrayHas6ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenArrayHas7Then1() {
        int[] data = {8, 7, 6, 5};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenArrayHas0ThenMinus1() {
        int[] data = {1, 2, 3, 4};
        int el = 0;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenArrayHasMinus2Then1() {
        int[] data = {5, -2, 3, 2};
        int el = -2;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}