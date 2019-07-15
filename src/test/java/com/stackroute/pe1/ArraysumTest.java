package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysumTest {

    @Test
    public void givenInputArrayShouldReturnSum(int n) {
        int a[] = new int[n];
        int actualResult=a.Arrayadder(1,3,5);
        assertArrayEquals(9,actualResult);

    }
}