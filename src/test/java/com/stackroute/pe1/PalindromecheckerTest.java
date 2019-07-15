package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromecheckerTest {
    Palindromechecker palindromechecker ;
    @Before
    public void setUp() {

        System.out.println("Inside Before");//arrange
       Palindromechecker palindromechecker=new Palindromechecker();

        this.palindromechecker = new Palindromechecker();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.palindromechecker = new Palindromechecker();
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
    public void givenStringShouldCheckPalindrome() {
        //arrange
        Palindromechecker palindromechecker = new Palindromechecker();
        //act
       String actualResult=palindromechecker.palindromeCheck(121);
       //assert
        assertEquals("palindrome",actualResult);


    }
    @Test
    public void givenStringShouldCheckForNotAPalindrome() {
        //arrange
        Palindromechecker palindromechecker = new Palindromechecker();
        //act
        String actualResult=palindromechecker.notAPalindromeCheck(12211);
        //assert
        assertEquals("not a palindrome",actualResult);


    }
}