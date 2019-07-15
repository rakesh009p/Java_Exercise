package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class GuessnumberTest {
    Guessnumber guessnumber ;
    @Before
    public void setUp() {

        System.out.println("Inside Before");//arrange
        Guessnumber guessnumber=new Guessnumber();

        this.guessnumber = new Guessnumber();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.guessnumber = new Guessnumber();
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

    public void givenAnIntegerShouldReturnString(){
        //arrange
        Guessnumber guessnumber = new Guessnumber();
        //act
        String actualResult=guessnumber.compareInt(34);
        //assert
        assertEquals("guessed properly",actualResult);



    }
    @Test
    public void givenGreaterIntegerThanExistingShouldReturnString(){
        //arrange
        Guessnumber guessnumber  = new Guessnumber();

        //act
        String actualResult=guessnumber.greaterInt(45);
        //assert
        assertEquals("greater than the original number",actualResult);

    }
    @Test
    public void givenSmallerIntegerThanExistingShouldReturnString(){
        //arrange
        Guessnumber guessnumber = new Guessnumber();
        //act
        String actualResult=guessnumber.smallerInt(23);
        //assert
        assertEquals("smaller than the original number",actualResult);



    }
}