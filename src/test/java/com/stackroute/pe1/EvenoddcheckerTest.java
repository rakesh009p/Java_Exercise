package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenoddcheckerTest {
    Evenoddchecker evenoddchecker ;
    @Before
    public void setUp() {

        System.out.println("Inside Before");//arrange
        Evenoddchecker evenoddchecker=new Evenoddchecker();

        this.evenoddchecker = new Evenoddchecker();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.evenoddchecker = new Evenoddchecker();
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
    public void givenAnIntegerShouldReturnStringValue(){

            //arrange
           Evenoddchecker evenoddchecker = new Evenoddchecker();
            //act
            int actualResult=evenoddchecker.compareeven(26);
            //assert
            assertEquals(26,actualResult);
    }
    @Test
    public void givenIntegerShouldReturnStringValue(){

        //arrange
        Evenoddchecker evenoddchecker = new Evenoddchecker();
        //act
        int actualResult=evenoddchecker.compareeven(27);
        //assert
        assertEquals(27,actualResult);
    }



}