package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class CapitalCheckerTest {
    CapitalChecker capitalChecker ;
    @Before
    public void setUp() {

        System.out.println("Inside Before");//arrange
        CapitalChecker capitalChecker=new CapitalChecker();

        this.capitalChecker = new CapitalChecker();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.capitalChecker = new CapitalChecker();
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
    public void givenCharShouldReturnString() {
        //arrange
        CapitalChecker capitalChecker = new CapitalChecker();
        //act
        String actualResult = capitalChecker.upperCase('A');
        //assert
        assertEquals("Capital",actualResult);
    }

    @Test
    public void givenChararacterShouldReturnString() {
        //arrange
        CapitalChecker capitalChecker = new CapitalChecker();
        //act
        String actualResult = capitalChecker.lowerCase('a');
        //assert
        assertEquals("Small",actualResult);
    }
}
