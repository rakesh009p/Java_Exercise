package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class NumberloopTest {
    Numberloop numberloop;
    @Before
    public void setUp() {

        System.out.println("Inside Before");//arrange
        Numberloop numberloop=new Numberloop();

        this.numberloop = new Numberloop();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.numberloop = new Numberloop();
    }

    @BeforeClass
    public static void beforeClass() {

        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println("After Class");
    }



    @Test
    public void givenIntegerShouldReturnRepeat() {
        //arrange
        Numberloop  numberloop = new Numberloop();
        //act
        int actualResult = numberloop.numberRepeater(2);
        //assert
        assertEquals(3,actualResult);

    }
}