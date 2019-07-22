package com.stackroute.pe1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class ArraySumTest {
    ArraySum arraySum;
    @Before
    public void setUp() throws Exception {
        arraySum = new ArraySum();
    }
    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void  givenArrayShouldReturnSumOfIt(){
        int data[] = {1,2,3,4,5};
        int n = 5;
        int actualvalue = arraySum.arrayAdder( 5,data);
        assertEquals(15,actualvalue);
    }
}