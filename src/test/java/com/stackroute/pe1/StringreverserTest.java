package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class StringreverserTest {

    Stringreverser stringreverser ;
    @Before
    public void setUp() {

        System.out.println("Inside Before");//arrange
        Stringreverser stringreverser=new Stringreverser();

        this.stringreverser = new Stringreverser();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.stringreverser= new Stringreverser();
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
    public void givenStringShouldReturnReverseAsOutput() {
        //arrange
        Stringreverser stringreverser= new Stringreverser();
        //act
        String actualResult=stringreverser.reverse("rakesh");
        //assert
        assertEquals("hsekar",actualResult);
    }
    @Test
    public void givenStringAsNullShouldReturnErrorMessage() {

        //arrange
        Stringreverser stringreverser = new Stringreverser();
        //act
        String actualresult=stringreverser.reverse(null);
        //assert
        assertNotNull(actualresult);
        assertEquals("Should Not Be Null", actualresult);

    }


}