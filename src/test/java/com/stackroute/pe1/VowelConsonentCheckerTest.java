package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelConsonentCheckerTest {
    VowelConsonentChecker vowelConsonentChecker;
    @Before
    public void setUp() {

        System.out.println("Inside Before");//arrange
        VowelConsonentChecker vowelConsonentChecker=new VowelConsonentChecker();

        this.vowelConsonentChecker = new VowelConsonentChecker();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        this.vowelConsonentChecker = new VowelConsonentChecker();
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

    public void givenAStringShouldReturnVowelsAndConsonants () {
        //arrange
    VowelConsonentChecker vowelConsonentChecker=new VowelConsonentChecker();
        //act
        String actualResult = vowelConsonentChecker.vowelConsChecker("rakesh");
        //assert
        assertEquals("rakesh", actualResult);
    }
    @Test

    public void givenAStringShouldReturnVowelsOrConsonents () {
        //arrange
        VowelConsonentChecker vowelConsonentChecker=new VowelConsonentChecker();

        //act
        String actualResult = vowelConsonentChecker.vowel("a");
        //assert
        assertEquals("vowel", actualResult);
    }


}
