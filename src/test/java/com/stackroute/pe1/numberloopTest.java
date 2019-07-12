package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class numberloopTest {

    @Test
    public void givenIntegerShouldReturnRepeat() {
        numberloop next = new numberloop();
        int actualResult = next.numberRepeater(2);
        assertEquals(3,actualResult);

    }
}