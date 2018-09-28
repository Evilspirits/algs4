package com.exercise.c1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Chapter One exercise
 *
 * @author zhoujl
 * @create 2018-07-27 23:08
 */
public class Chapter1 {
    /**
     * 1.1.16
     *
     * n = 0:
     * n = 1: 11
     * n = 2: 22
     * n = 3: 3113
     * n = 4: 114224
     * n = 5: 225003355
     * n = 6: 311361142246
     */
    @Test
    public void exR1Test() {
        String s = exR1(6);
        Assert.assertEquals("311361142246", s);
    }

    /**
     * 1.1.17
     *
     * @author zhoujl
     */
    @Test(expected = StackOverflowError.class)
    public void exR2Test() {
        exR2(0);
    }

    private String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    private String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) return "";
        return s;
    }
}
